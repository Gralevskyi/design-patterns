package com.hralievsky.learning.design.patterns.behavioral.iterator.collection;

import com.hralievsky.learning.design.patterns.behavioral.iterator.iterators.Iterator;
import com.hralievsky.learning.design.patterns.behavioral.iterator.iterators.SongIterator;
import com.hralievsky.learning.design.patterns.behavioral.iterator.music.Song;

import java.util.ArrayList;
import java.util.List;

public class SongCollection implements Collection<Song> {
    private List<Song> songs = new ArrayList<>();

    public SongCollection(List<Song> songs) {
        this.songs.addAll(songs);
    }

    @Override
    public Iterator<Song> iterator() {
        return new SongIterator(songs);
    }
}
