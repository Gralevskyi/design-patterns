package com.hralievsky.learning.design.patterns.structural.flyweight;

import java.util.Objects;

public class FormattedCharacter {
    private final char value;
    private final String fontFamily;
    private final int fontSize;
    private final String fontColor;
    private final FontStyle fontStyle;

    private FormattedCharacter(
            char value,
            String fontFamily,
            int fontSize,
            String fontColor,
            FontStyle fontStyle
    ) {
        this.value = value;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.fontColor = fontColor;
        this.fontStyle = fontStyle;
    }

    public char getValue() {
        return value;
    }

    public static FormattedCharacter create(char value,
                                            String fontFamily,
                                            int fontSize,
                                            String fontColor,
                                            FontStyle fontStyle) {
        return new FormattedCharacter(value, fontFamily, fontSize, fontColor, fontStyle);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FormattedCharacter)) return false;
        FormattedCharacter that = (FormattedCharacter) o;
        return value == that.value &&
               fontSize == that.fontSize &&
               Objects.equals(fontFamily, that.fontFamily) &&
               Objects.equals(fontColor, that.fontColor) &&
               fontStyle == that.fontStyle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, fontFamily, fontSize, fontColor, fontStyle);
    }

}
