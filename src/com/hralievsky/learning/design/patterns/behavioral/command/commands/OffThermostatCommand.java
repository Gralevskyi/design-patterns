package com.hralievsky.learning.design.patterns.behavioral.command.commands;

import com.hralievsky.learning.design.patterns.behavioral.command.devices.Thermostat;

public class OffThermostatCommand implements Command {
    private final Thermostat thermostat;

    public OffThermostatCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.turnOff();
    }
}
