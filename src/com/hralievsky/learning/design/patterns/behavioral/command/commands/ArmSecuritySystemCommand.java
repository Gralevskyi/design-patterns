package com.hralievsky.learning.design.patterns.behavioral.command.commands;

import com.hralievsky.learning.design.patterns.behavioral.command.devices.SecuritySystem;

public class ArmSecuritySystemCommand implements Command {
    private final SecuritySystem securitySystem;

    public ArmSecuritySystemCommand(SecuritySystem securitySystem) {
        this.securitySystem = securitySystem;
    }

    @Override
    public void execute() {
        securitySystem.arm();
    }
}
