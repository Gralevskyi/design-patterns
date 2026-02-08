package com.hralievsky.learning.design.patterns.behavioral.iterator.iterators;

import com.hralievsky.learning.design.patterns.behavioral.iterator.music.Song;

import java.util.List;

public class SongIterator implements Iterator<Song> {
    private final List<Song> items;
    private int index = 0;

    public SongIterator(List<Song> items) {
        this.items = items;
    }


    @Override
    public boolean hasNext() {
        return index < items.size();
    }

    @Override
    public Song next() {
        Song item = items.get(index);
        index++;
        return item;
    }
}
