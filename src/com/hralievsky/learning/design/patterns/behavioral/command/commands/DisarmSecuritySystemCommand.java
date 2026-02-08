package com.hralievsky.learning.design.patterns.behavioral.command.commands;

import com.hralievsky.learning.design.patterns.behavioral.command.devices.SecuritySystem;

public class DisarmSecuritySystemCommand implements Command {
    private final SecuritySystem securitySystem;

    public DisarmSecuritySystemCommand(SecuritySystem securitySystem) {
        this.securitySystem = securitySystem;
    }

    @Override
    public void execute() {
        securitySystem.disarm();
    }
}
