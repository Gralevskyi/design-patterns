package com.hralievsky.learning.design.patterns.behavioral.iterator.music;

public class Song implements ArtItem {
    private final String title;
    private final String artist;

    private Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public static Song create(String title, String artist) {
        return new Song(title, artist);
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return title + " by " + artist;
    }
}
