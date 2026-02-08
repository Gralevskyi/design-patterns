package com.hralievsky.learning.design.patterns.behavioral.command.devices;

//Receiver
public class Thermostat {
    private boolean on = false;

    public Thermostat() {
    }

    public void turnOff() {
        System.out.println("Turning off thermostat");
        on = false;
    }

    public void turnOn() {
        System.out.println("Thermostat on");
        on = true;
    }

}
