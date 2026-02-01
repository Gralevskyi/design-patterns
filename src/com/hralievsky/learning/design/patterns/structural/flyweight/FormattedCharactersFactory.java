package com.hralievsky.learning.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FormattedCharactersFactory {
    private final Map<FormattedCharacter, FormattedCharacter> formats;

    public FormattedCharactersFactory() {
        this.formats = new HashMap<>();
    }

    public FormattedCharacter getCharacterFormat(FormattedCharacter format) {
        return formats.computeIfAbsent(format, k -> format);
    }

    public int getUniqueFormatCount() {
        return formats.size();
    }
}
