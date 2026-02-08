package com.hralievsky.learning.design.patterns.behavioral.command.devices;

//Receiver
public class Light {

    public Light() {
    }

    public void turnOff() {
        System.out.println("Turning off light");
    }

    public void turnOn() {
        System.out.println("Lighting on");
    }

}
