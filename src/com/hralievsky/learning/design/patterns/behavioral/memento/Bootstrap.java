package com.hralievsky.learning.design.patterns.behavioral.memento;


import com.hralievsky.learning.design.patterns.behavioral.memento.documents.Document;

/**
 * Simple Task: Document Version Saver
 * <p>
 * Objective: Implement a minimal document editor that can save and restore versions.
 * <p>
 * Requirements:
 * <p>
 * 1. Document (Originator):fix
 * - Store text content
 * - Create a snapshot (memento)
 * - Restore from a snapshot
 * 2. DocumentMemento (Memento):
 * - Store the document content (just a String)
 * - Immutable
 * 3. VersionControl (Caretaker):
 * - Save current version
 * - Restore last saved version
 * 4. Bootstrap: Demo with:
 * - Write initial text → save
 * - Modify text
 * - Restore to saved version
 */
public class Bootstrap {

    public static void main(String[] args) {
        VersionControl versionControl = VersionControl.create();
        Document document = Document.create("First Text");

        versionControl.add(document.save());

        document.replace("Second Text");
        System.out.println("Current document text: " + document.getText());

        document.restore(versionControl.pop());
        System.out.println("Restored document text: " + document.getText());
    }
}
