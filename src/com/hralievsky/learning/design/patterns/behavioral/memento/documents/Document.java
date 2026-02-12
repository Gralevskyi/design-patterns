package com.hralievsky.learning.design.patterns.behavioral.memento.documents;

import com.hralievsky.learning.design.patterns.behavioral.memento.Memento;

import java.time.LocalDateTime;

public class Document {
    private String text;

    private Document(String text) {
        this.text = text;
    }

    public static Document create(String text) {
        return new Document(text);
    }

    public void replace(String text) {
        this.text = text;
    }

    public Memento save() {
        return new DocumentMemento(text);
    }

    public void restore(Memento memento) {
        if (memento instanceof DocumentMemento m) {
            this.text = m.getText();
        } else {
            throw new IllegalArgumentException("The memento is not a DocumentMemento");
        }
    }

    public String getText() {
        return text;
    }

    //Concrete memento details should not be available for Caretaker (VersionControl) as it should not know internal details
    private static class DocumentMemento implements Memento {
        private final LocalDateTime created;
        private final String text;


        public DocumentMemento(String text) {
            this.text = text;
            this.created = LocalDateTime.now();
        }

        String getText() {
            return text;
        }

        @Override
        public LocalDateTime getCreated() {
            return created;
        }
    }
}
