package com.hralievsky.learning.design.patterns.behavioral.iterator.collection;

import com.hralievsky.learning.design.patterns.behavioral.iterator.iterators.Iterator;
import com.hralievsky.learning.design.patterns.behavioral.iterator.music.ArtItem;

public interface Collection<T extends ArtItem> {
    Iterator<T> iterator();
}
