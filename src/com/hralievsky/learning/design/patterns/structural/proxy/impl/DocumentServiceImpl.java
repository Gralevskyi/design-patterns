package com.hralievsky.learning.design.patterns.structural.proxy.impl;

import com.hralievsky.learning.design.patterns.structural.proxy.DocumentService;
import com.hralievsky.learning.design.patterns.structural.proxy.document.Document;
import com.hralievsky.learning.design.patterns.structural.proxy.user.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentServiceImpl implements DocumentService {
    private Map<String, Document> documents = new HashMap<>();


    @Override
    public void uploadDocuments(List<Document> documents, User initiator) {
        documents
                .forEach(document -> this.documents.put(document.getName(), document));
        System.out.println("  [REAL SERVICE] " + documents.size() + " document(s) uploaded by " + initiator.getRole());
    }

    @Override
    public Document getDocument(String name, User initiator) {
        System.out.println("  [REAL SERVICE] Retrieving document '" + name + "' for " + initiator.getRole());
        return documents.get(name);
    }
}
