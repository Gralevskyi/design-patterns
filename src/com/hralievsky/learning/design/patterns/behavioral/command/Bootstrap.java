package com.hralievsky.learning.design.patterns.behavioral.command;

import com.hralievsky.learning.design.patterns.behavioral.command.control.RemoteControl;
import com.hralievsky.learning.design.patterns.behavioral.command.devices.Light;
import com.hralievsky.learning.design.patterns.behavioral.command.devices.MusicPlayer;
import com.hralievsky.learning.design.patterns.behavioral.command.devices.SecuritySystem;
import com.hralievsky.learning.design.patterns.behavioral.command.devices.Thermostat;

/**
 * Smart Home Automation System
 * <p>
 * Context:You are building a smart home automation system where users can control various devices through a central controller. The system should support executing commands and creating macro commands that
 * execute multiple actions at once.
 * <p>
 * Requirements:
 * <p>
 * 1. Devices: Light, Thermostat, SecuritySystem, MusicPlayer
 * - Light: can turn on/off
 * - Thermostat: can turn on/off
 * - SecuritySystem: can arm/disarm
 * - MusicPlayer: can play/stop
 * 2. Commands: Each device action should be encapsulated as a command
 * - Examples: LightOnCommand, LightOffCommand, ArmSecurityCommand, DisarmSecurityCommand, etc.
 * 3. Remote Control: Create a RemoteControl class that:
 * - Can execute any command
 * - Supports macro commands (e.g., "Good Night" mode: turn off lights, turn off thermostat, arm security, stop music)
 * 4. Logging: Log each command execution
 */

public class Bootstrap {
    public static void main(String[] args) {
        Client client = new Client();
        RemoteControl remoteControl = client.getRemoteControl();

        remoteControl.disarmSecuritySystem();
        remoteControl.lightOn();
        remoteControl.playMusic();
        remoteControl.onThermostat();

        remoteControl.goodNight();

        remoteControl.hello();

        remoteControl.offThermostat();
        remoteControl.stopMusic();
        remoteControl.lightOff();
        remoteControl.armSecuritySystem();
    }
}
