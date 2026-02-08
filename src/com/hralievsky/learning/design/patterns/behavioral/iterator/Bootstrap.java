package com.hralievsky.learning.design.patterns.behavioral.iterator;


import com.hralievsky.learning.design.patterns.behavioral.iterator.collection.Collection;
import com.hralievsky.learning.design.patterns.behavioral.iterator.collection.SongCollection;
import com.hralievsky.learning.design.patterns.behavioral.iterator.iterators.Iterator;
import com.hralievsky.learning.design.patterns.behavioral.iterator.music.Song;

import java.util.ArrayList;
import java.util.List;

/**
 * Music Playlist Iterator
 * <p>
 * Context:You are building a music player application that manages playlists. Users should be able to iterate through songs in a playlist without exposing the internal structure of how songs are stored.
 * <p>
 * Requirements:
 * <p>
 * 1. Song: Simple class with title and artist fields
 * 2. Playlist: Container that stores songs
 * - Should hide internal storage implementation (ArrayList, array, LinkedList, etc.)
 * - Provide method to get an iterator
 * 3. Iterator Interface: Define iteration behavior
 * - hasNext() - checks if more songs exist
 * - next() - returns next song
 * 4. Concrete Iterator: Implements iteration over playlist
 * - Tracks current position
 * - Returns songs sequentially
 * 5. Demonstration:
 * - Create a playlist with 5-6 songs
 * - Use iterator to traverse and print all songs
 * - Show that client code doesn't know how songs are stored internally
 * <p>
 * Logging: Print each song as you iterate (format: "Now playing: [title] by [artist]")
 */
public class Bootstrap {
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();

        Song stairwayToHeaven = Song.create("Stairway to Heaven", "Led Zeppelin");
        songs.add(stairwayToHeaven);
        Song bohemianRhapsody = Song.create("Bohemian Rhapsody", "Queen");
        songs.add(bohemianRhapsody);
        Song hotelCalifornia = Song.create("Hotel California", "Eagles");
        songs.add(hotelCalifornia);
        Song sweetChildMine = Song.create("Sweet Child O’ Mine", "Guns N’ Roses");
        songs.add(sweetChildMine);
        Song smokeOnTheWater = Song.create("Smoke on the Water", "Deep Purple");
        songs.add(smokeOnTheWater);

        Collection<Song> songCollection = new SongCollection(songs);

        Iterator<Song> iterator = songCollection.iterator();

        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Now playing:" + song);
        }

    }
}
