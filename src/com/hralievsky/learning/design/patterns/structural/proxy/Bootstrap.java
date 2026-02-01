package com.hralievsky.learning.design.patterns.structural.proxy;

import com.hralievsky.learning.design.patterns.structural.proxy.document.Document;
import com.hralievsky.learning.design.patterns.structural.proxy.document.DocumentAccessLevel;
import com.hralievsky.learning.design.patterns.structural.proxy.impl.DocumentServiceImpl;
import com.hralievsky.learning.design.patterns.structural.proxy.impl.ProxyDocumentService;
import com.hralievsky.learning.design.patterns.structural.proxy.user.Employee;
import com.hralievsky.learning.design.patterns.structural.proxy.user.Guest;
import com.hralievsky.learning.design.patterns.structural.proxy.user.Manager;
import com.hralievsky.learning.design.patterns.structural.proxy.user.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Document Access Control
 * <p>
 * Context:
 * You have confidential documents that should only be accessible to authorized users.
 * <p>
 * Requirements:
 * <p>
 * 1. Users have roles: "guest", "employee", "manager"
 * 2. Documents have access levels: "public", "internal", "confidential"
 * 3. Access rules:
 * - Guests: only public documents
 * - Employees: public and internal documents
 * - Managers: all documents
 * 4. Log every access attempt (allowed or denied)
 * 5. Block unauthorized access before reaching the actual document
 * <p>
 * Demonstration:
 * Show different users trying to read documents with various access levels.
 */

public class Bootstrap {

    public static void main(String[] args) {
        Document confidential = new Document(DocumentAccessLevel.CONFIDENTIAL, "confidential");
        Document internal = new Document(DocumentAccessLevel.INTERNAL, "internal");
        Document publicDoc = new Document(DocumentAccessLevel.PUBLIC, "public");

        DocumentService documentService = new ProxyDocumentService(new DocumentServiceImpl());

        List<Document> allDocuments = Arrays.asList(confidential, internal, publicDoc);
        List<Document> employeeDocuments = Arrays.asList(internal, publicDoc);
        List<Document> confidentialDocuments = Collections.singletonList(confidential);

        User manager = new Manager(0);
        User employee = new Employee(1);
        User guest = new Guest(2);

        System.out.println("=== Testing Upload Access Control ===\n");
        documentService.uploadDocuments(allDocuments, guest);
        System.out.println();
        documentService.uploadDocuments(allDocuments, employee);
        System.out.println();
        documentService.uploadDocuments(employeeDocuments, employee);
        System.out.println();
        documentService.uploadDocuments(confidentialDocuments, manager);

        System.out.println("\n=== Testing Document Retrieval Access Control ===\n");

        System.out.println("--- Manager accessing all documents ---");
        documentService.getDocument("confidential", manager);
        documentService.getDocument("internal", manager);
        documentService.getDocument("public", manager);

        System.out.println("\n--- Employee accessing all documents ---");
        documentService.getDocument("confidential", employee);
        documentService.getDocument("internal", employee);
        documentService.getDocument("public", employee);

        System.out.println("\n--- Guest accessing all documents ---");
        documentService.getDocument("confidential", guest);
        documentService.getDocument("internal", guest);
        documentService.getDocument("public", guest);
    }

}
