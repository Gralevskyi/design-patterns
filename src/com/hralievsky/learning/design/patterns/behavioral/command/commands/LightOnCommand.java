package com.hralievsky.learning.design.patterns.behavioral.command.commands;

import com.hralievsky.learning.design.patterns.behavioral.command.devices.Light;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
