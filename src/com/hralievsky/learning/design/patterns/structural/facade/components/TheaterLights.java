package com.hralievsky.learning.design.patterns.structural.facade.components;

public class TheaterLights {

    public void turnOn() {
        System.out.println("Theater lights are ON");
    }


    public void turnOff() {
        System.out.println("Theater lights are OFF");
    }

    public void dim(int level) {
        System.out.println("Theater lights dimmed to " + level + "%");
    }
}

