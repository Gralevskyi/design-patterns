package com.hralievsky.learning.design.patterns.structural.facade.components;

public class DvdPlayer {
    public void turnOn() {
        System.out.println("DVD Player is turned ON");
    }

    public void turnOff() {
        System.out.println("DVD Player is turned OFF");
    }

    public void insertDisc(String discName) {
        System.out.println("Disc inserted: " + discName);
    }

    public void play() {
        System.out.println("DVD Player starts playing");
    }

    public void stop() {
        System.out.println("DVD Player stopped");
    }

    public void ejectDisc() {
        System.out.println("Disc ejected");
    }
}
