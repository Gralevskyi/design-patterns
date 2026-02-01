package com.hralievsky.learning.design.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<TxCharacter> characters = new ArrayList<>();
    private FormattedCharactersFactory formattedCharactersFactory;

    public Document() {
        this.formattedCharactersFactory = new FormattedCharactersFactory();
    }

    public void insertCharacter(char value,
                                String fontFamily,
                                int fontSize,
                                String fontColor,
                                FontStyle fontStyle,
                                int row,
                                int col) {
        FormattedCharacter format = formattedCharactersFactory.getCharacterFormat(
                FormattedCharacter.create(value, fontFamily, fontSize, fontColor, fontStyle)
        );
        TxCharacter txCharacter = new TxCharacter(row, col, format);
        characters.add(txCharacter);
    }

    public void printStatistics() {
        System.out.println("Total characters in document: " + characters.size());
        System.out.println("Unique flyweight objects created: " + formattedCharactersFactory.getUniqueFormatCount());
        System.out.println("Memory savings: " + (characters.size() - formattedCharactersFactory.getUniqueFormatCount()) + " objects reused");
    }

}
