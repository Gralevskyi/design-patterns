package com.hralievsky.learning.design.patterns.behavioral.command;

import com.hralievsky.learning.design.patterns.behavioral.command.control.RemoteControl;
import com.hralievsky.learning.design.patterns.behavioral.command.devices.Light;
import com.hralievsky.learning.design.patterns.behavioral.command.devices.MusicPlayer;
import com.hralievsky.learning.design.patterns.behavioral.command.devices.SecuritySystem;
import com.hralievsky.learning.design.patterns.behavioral.command.devices.Thermostat;

//Client component
public class Client {
    private final Light light = new Light();
    private final MusicPlayer musicPlayer = new MusicPlayer();
    private final Thermostat thermostat = new Thermostat();
    private final SecuritySystem securitySystem = new SecuritySystem();

    public Client() {
    }

    public RemoteControl getRemoteControl() {
        return RemoteControl.create(light, musicPlayer, securitySystem, thermostat);
    }
}
