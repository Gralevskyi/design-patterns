package com.hralievsky.learning.design.patterns.structural.facade.impl;

import com.hralievsky.learning.design.patterns.structural.facade.MovieFacade;
import com.hralievsky.learning.design.patterns.structural.facade.components.Amplifier;
import com.hralievsky.learning.design.patterns.structural.facade.components.DvdPlayer;
import com.hralievsky.learning.design.patterns.structural.facade.components.PopcornMaker;
import com.hralievsky.learning.design.patterns.structural.facade.components.Projector;
import com.hralievsky.learning.design.patterns.structural.facade.components.Screen;
import com.hralievsky.learning.design.patterns.structural.facade.components.TheaterLights;

public class MovieFacadeImpl implements MovieFacade {
    private static final Amplifier amplifier = new Amplifier();
    private static final DvdPlayer dvdPlayer = new DvdPlayer();
    private static final PopcornMaker popcornMaker = new PopcornMaker();
    private static final Projector projector = new Projector();
    private static final Screen screen = new Screen();
    private static final TheaterLights theaterLights = new TheaterLights();

    private final String movieName;

    public MovieFacadeImpl(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public void watchMovie() {
        amplifier.turnOn();
        dvdPlayer.insertDisc(movieName);
        screen.down();
        projector.turnOn();
        theaterLights.turnOn();
        theaterLights.dim(2);
        dvdPlayer.play();
        projector.focus();
        popcornMaker.turnOn();
        popcornMaker.pop();
        System.out.println("***" + movieName + " has been started ***\n");
    }

    @Override
    public void endMovie() {
        dvdPlayer.stop();
        theaterLights.dim(3);
        dvdPlayer.ejectDisc();
        projector.turnOff();
        screen.up();
        amplifier.turnOff();
        theaterLights.turnOff();
        dvdPlayer.turnOff();
        popcornMaker.turnOff();
        System.out.println("---" + movieName + " has been stopped ---\n");
    }
}
