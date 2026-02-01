package com.hralievsky.learning.design.patterns.structural.proxy.document;

public class Document {
    private final DocumentAccessLevel accessLevel;
    private final String name;

    public Document(DocumentAccessLevel accessLevel, String name) {
        this.accessLevel = accessLevel;
        this.name = name;
    }

    public DocumentAccessLevel getAccessLevel() {
        return accessLevel;
    }

    public String getName() {
        return name;
    }
}
