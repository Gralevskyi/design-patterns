package com.hralievsky.learning.design.patterns.behavioral.command.devices;

//Receiver
public class SecuritySystem {

    public SecuritySystem() {
    }

    public void arm() {
        System.out.println("Turning on Security System");
    }

    public void disarm() {
        System.out.println("SecuritySystem off");
    }

}
