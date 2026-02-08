package com.hralievsky.learning.design.patterns.behavioral.command.commands;

import com.hralievsky.learning.design.patterns.behavioral.command.devices.Thermostat;

public class OnThermostatCommand implements Command {
    private final Thermostat thermostat;

    public OnThermostatCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.turnOn();
    }
}
