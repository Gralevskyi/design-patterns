package com.hralievsky.learning.design.patterns.behavioral.command.commands;

import com.hralievsky.learning.design.patterns.behavioral.command.devices.MusicPlayer;

public class PlayMusicCommand implements Command {
    private final MusicPlayer musicPlayer;

    public PlayMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.play();
    }
}
