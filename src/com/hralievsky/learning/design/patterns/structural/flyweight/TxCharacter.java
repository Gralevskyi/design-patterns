package com.hralievsky.learning.design.patterns.structural.flyweight;

public class TxCharacter {
    private final int row;
    private final int column;
    private final FormattedCharacter formattedCharacter;


    public TxCharacter(int row, int column, FormattedCharacter formattedCharacter) {
        this.row = row;
        this.column = column;
        this.formattedCharacter = formattedCharacter;
    }

}
