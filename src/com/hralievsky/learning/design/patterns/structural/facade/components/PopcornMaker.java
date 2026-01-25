package com.hralievsky.learning.design.patterns.structural.facade.components;

public class PopcornMaker {

    public void turnOn() {
        System.out.println("Popcorn maker is ON");
    }

    public void turnOff() {
        System.out.println("Popcorn maker is OFF");
    }

    public void pop() {
        System.out.println("Popcorn maker is popping popcorn");
    }
}
