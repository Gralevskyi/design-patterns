package com.hralievsky.learning.design.patterns.behavioral.command.devices;

//Receiver
public class MusicPlayer {

    public MusicPlayer() {
    }

    public void play() {
        System.out.println("play music");
    }

    public void stop() {
        System.out.println("Stop music");
    }

}
