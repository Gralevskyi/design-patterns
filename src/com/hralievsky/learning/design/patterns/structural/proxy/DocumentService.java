package com.hralievsky.learning.design.patterns.structural.proxy;

import com.hralievsky.learning.design.patterns.structural.proxy.document.Document;
import com.hralievsky.learning.design.patterns.structural.proxy.user.User;

import java.util.List;

public interface DocumentService {
    void uploadDocuments(List<Document> documents, User initiator);

    Document getDocument(String name, User initiator);
}
