package com.hralievsky.learning.design.patterns.behavioral.command.control;

import com.hralievsky.learning.design.patterns.behavioral.command.commands.ArmSecuritySystemCommand;
import com.hralievsky.learning.design.patterns.behavioral.command.commands.DisarmSecuritySystemCommand;
import com.hralievsky.learning.design.patterns.behavioral.command.commands.LightOffCommand;
import com.hralievsky.learning.design.patterns.behavioral.command.commands.LightOnCommand;
import com.hralievsky.learning.design.patterns.behavioral.command.commands.OffThermostatCommand;
import com.hralievsky.learning.design.patterns.behavioral.command.commands.OnThermostatCommand;
import com.hralievsky.learning.design.patterns.behavioral.command.commands.PlayMusicCommand;
import com.hralievsky.learning.design.patterns.behavioral.command.commands.StopMusicCommand;
import com.hralievsky.learning.design.patterns.behavioral.command.devices.Light;
import com.hralievsky.learning.design.patterns.behavioral.command.devices.MusicPlayer;
import com.hralievsky.learning.design.patterns.behavioral.command.devices.SecuritySystem;
import com.hralievsky.learning.design.patterns.behavioral.command.devices.Thermostat;

public class RemoteControl {
    private final Button lightOnButton;
    private final Button lightOffButton;
    private final Button playMusicButton;
    private final Button stopMusicButton;
    private final Button onThermostatButton;
    private final Button offThermostatButton;
    private final Button armSecuritySystemButton;
    private final Button disarmSecuritySystemButton;

    private RemoteControl(Light light, MusicPlayer musicPlayer, SecuritySystem securitySystem, Thermostat thermostat) {
        lightOnButton = Button.create("Light on", new LightOnCommand(light));
        lightOffButton = Button.create("Light off", new LightOffCommand(light));
        playMusicButton = Button.create("Play music", new PlayMusicCommand(musicPlayer));
        stopMusicButton = Button.create("Stop music", new StopMusicCommand(musicPlayer));
        onThermostatButton = Button.create("On thermostat", new OnThermostatCommand(thermostat));
        offThermostatButton = Button.create("Off thermostat", new OffThermostatCommand(thermostat));
        armSecuritySystemButton = Button.create("Arm Security", new ArmSecuritySystemCommand(securitySystem));
        disarmSecuritySystemButton = Button.create("Disarm Security", new DisarmSecuritySystemCommand(securitySystem));
    }

    public static RemoteControl create(Light light, MusicPlayer musicPlayer, SecuritySystem securitySystem, Thermostat thermostatc) {
        return new RemoteControl(light, musicPlayer, securitySystem, thermostatc);
    }

    public void goodNight() {
        System.out.println("Good night!");
        offThermostatButton.onClick();
        lightOffButton.onClick();
        stopMusicButton.onClick();
        armSecuritySystemButton.onClick();
    }

    public void hello() {
        System.out.println("Hello!");
        disarmSecuritySystemButton.onClick();
        onThermostatButton.onClick();
        lightOnButton.onClick();
        playMusicButton.onClick();
    }

    public void lightOn() {
        lightOnButton.onClick();
    }

    public void lightOff() {
        lightOffButton.onClick();
    }

    public void playMusic() {
        playMusicButton.onClick();
    }

    public void stopMusic() {
        stopMusicButton.onClick();
    }

    public void armSecuritySystem() {
        armSecuritySystemButton.onClick();
    }

    public void disarmSecuritySystem() {
        disarmSecuritySystemButton.onClick();
    }

    public void onThermostat() {
        onThermostatButton.onClick();
    }

    public void offThermostat() {
        offThermostatButton.onClick();
    }

}
