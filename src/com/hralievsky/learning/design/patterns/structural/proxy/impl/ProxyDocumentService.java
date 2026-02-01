package com.hralievsky.learning.design.patterns.structural.proxy.impl;

import com.hralievsky.learning.design.patterns.structural.proxy.DocumentService;
import com.hralievsky.learning.design.patterns.structural.proxy.document.Document;
import com.hralievsky.learning.design.patterns.structural.proxy.document.DocumentAccessLevel;
import com.hralievsky.learning.design.patterns.structural.proxy.user.User;
import com.hralievsky.learning.design.patterns.structural.proxy.user.UserRole;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ProxyDocumentService implements DocumentService {
    private final DocumentService documentService;
    private final Map<String, DocumentAccessLevel> documentMetadata;

    public ProxyDocumentService(DocumentService documentService) {
        this.documentService = documentService;
        this.documentMetadata = new HashMap<>();
    }

    @Override
    public void uploadDocuments(List<Document> documents, User initiator) {
        System.out.println("[ACCESS LOG] " + initiator.getRole() + " attempting to upload " + documents.size() + " document(s)");

        if (initiator.getRole() == UserRole.GUEST) {
            System.out.println("[ACCESS DENIED] Guest cannot upload documents");
            return;
        }

        if (initiator.getRole() == UserRole.EMPLOYEE) {
            Optional<Document> confidentialDocument = documents
                    .stream()
                    .filter(document -> document.getAccessLevel() == DocumentAccessLevel.CONFIDENTIAL)
                    .findAny();

            if (confidentialDocument.isPresent()) {
                System.out.println("[ACCESS DENIED] Employee cannot upload confidential documents");
                return;
            }
        }

        System.out.println("[ACCESS GRANTED] Upload permitted");

        // Store metadata for later access control
        documents.forEach(doc -> documentMetadata.put(doc.getName(), doc.getAccessLevel()));

        documentService.uploadDocuments(documents, initiator);
    }

    @Override
    public Document getDocument(String name, User initiator) {
        System.out.println("[ACCESS LOG] " + initiator.getRole() + " attempting to access document '" + name + "'");

        // Check if document exists in metadata
        DocumentAccessLevel documentAccessLevel = documentMetadata.get(name);

        if (documentAccessLevel == null) {
            System.out.println("[ERROR] Document '" + name + "' not found");
            return null;
        }

        // Check access permissions BEFORE calling the real service
        boolean accessGranted = false;

        if (initiator.getRole() == UserRole.MANAGER) {
            System.out.println("[ACCESS GRANTED] Manager has full access to " + documentAccessLevel + " document");
            accessGranted = true;
        } else if (documentAccessLevel == DocumentAccessLevel.CONFIDENTIAL) {
            System.out.println("[ACCESS DENIED] " + initiator.getRole() + " cannot access CONFIDENTIAL documents");
            return null;
        } else if (documentAccessLevel == DocumentAccessLevel.INTERNAL && initiator.getRole() == UserRole.GUEST) {
            System.out.println("[ACCESS DENIED] Guest cannot access INTERNAL documents");
            return null;
        } else {
            System.out.println("[ACCESS GRANTED] " + initiator.getRole() + " can access " + documentAccessLevel + " document");
            accessGranted = true;
        }

        // Only call real service if access is granted
        if (accessGranted) {
            return documentService.getDocument(name, initiator);
        }

        return null;
    }
}
