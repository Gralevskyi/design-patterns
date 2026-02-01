package com.hralievsky.learning.design.patterns.structural.flyweight;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Business Requirements: Text Editor Character Rendering System
 * <p>
 * Context:
 * You are building a text editor that needs to render documents containing thousands of characters. Each character has formatting properties (font family, size, color, style) and position information. The current implementation creates a
 * new object for every single character in the document, causing excessive memory consumption.
 * <p>
 * Requirements:
 * <p>
 * 1. Character Representation:
 * - Characters must support the following intrinsic (shared) properties:
 * - Character value (the actual letter/symbol)
 * - Font family (e.g., "Arial", "Times New Roman", "Courier")
 * - Font size (e.g., 12, 14, 16)
 * - Font color (e.g., "Black", "Red", "Blue")
 * - Font style (e.g., "Bold", "Italic", "Regular")
 * 2. Position Management:
 * - Each character instance in the document has extrinsic (unique) properties:
 * - Row position (line number in document)
 * - Column position (character position in line)
 * 3. Character Factory:
 * - Implement a factory that ensures characters with identical formatting share the same object instance
 * - The factory should return existing character objects when the same formatting is requested
 * 4. Document Class:
 * - Create a document class that can insert characters at specific positions
 * - The document should demonstrate memory efficiency by reusing character objects
 * 5. Demonstration:
 * - Show that inserting 100+ characters with only 5-10 unique formatting combinations creates far fewer objects than 100+ individual objects
 * - Provide a way to verify how many unique character objects were actually created vs. how many character instances are in the document
 * <p>
 * Success Criteria:
 * - Multiple characters with identical formatting properties share the same flyweight object
 * - Position information is stored externally (not in the flyweight)
 * - The system can render a document with hundreds of characters while maintaining a small pool of shared formatting objects
 * <p>
 * ---
 * This task focuses on the core Flyweight pattern concept: separating intrinsic (shared) state from extrinsic (unique) state to minimize memory usage when dealing with large numbers of similar objects.
 */


public class Bootstrap {
    public static void main(String[] args) {
        Document document = new Document();

        // Simulate typing a document with limited character variety but different formatting
        // We'll use 5 unique character values: 'H', 'e', 'l', 'o', 'W'
        String text = "HelloWorld";

        String[][] formats = {
                {"Arial", "14", "Black", "REGULAR"},
                {"Arial", "14", "Black", "BOLD"},
                {"Times New Roman", "12", "Blue", "ITALIC"},
                {"Courier", "16", "Red", "REGULAR"},
                {"Verdana", "12", "Green", "BOLD"}
        };

        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 10; col++) {
                char value = text.charAt(ThreadLocalRandom.current().nextInt(text.length()));

                String[] format = formats[ThreadLocalRandom.current().nextInt(formats.length)];

                document.insertCharacter(
                        value,
                        format[0],
                        Integer.parseInt(format[1]),
                        format[2],
                        FontStyle.valueOf(format[3]),
                        row,
                        col
                );
            }
        }

        System.out.println("=== Flyweight Pattern Demonstration ===");
        document.printStatistics();
        System.out.println("\nExplanation:");
        System.out.println("Even though 200 characters were inserted, only a small number of");
        System.out.println("flyweight objects were created because many characters share the");
        System.out.println("same intrinsic state (character value + formatting).");
    }
}
