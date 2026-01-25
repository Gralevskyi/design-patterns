package com.hralievsky.learning.design.patterns.structural.facade.components;

public class Projector {
    public void turnOn() {
        System.out.println("Projector is turned ON");
    }

    public void turnOff() {
        System.out.println("Projector is turned OFF");
    }

    public void wideScreenMode() {
        System.out.println("Projector set to widescreen mode");
    }

    public void focus() {
        System.out.println("Projector focus adjusted");
    }
}
