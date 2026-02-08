package com.hralievsky.learning.design.patterns.behavioral.iterator.iterators;

import com.hralievsky.learning.design.patterns.behavioral.iterator.music.ArtItem;

public interface Iterator<T extends ArtItem> {
    boolean hasNext();

    T next();
}
