package com.hralievsky.learning.design.patterns.structural.facade;

import com.hralievsky.learning.design.patterns.structural.facade.impl.MovieFacadeImpl;

/**
 * Create a home entertainment system that simplifies watching a movie. The system consists of multiple complex components that need to work together:
 * 1. Components include: Amplifier, DVD Player, Projector, Screen, Theater Lights, Popcorn Maker
 * 2. Each component has its own operations (turn on/off, adjust settings, load media, etc.)
 * 3. Watching a movie requires a specific sequence: dim lights, lower screen, turn on projector, set projector input, turn on amplifier, set amplifier to DVD mode, turn on DVD player, start popcorn maker
 * 4. Ending a movie requires reversing most of these steps in proper order
 * 5. The system should provide simple operations like "watch movie" and "end movie" that handle all the complexity internally
 * <p>
 * Demonstrate with examples showing the simplified interface hiding the complexity of coordinating all components.
 */

public class Bootstrap {
    public static void main(String[] args) {
        MovieFacade titanic = new MovieFacadeImpl("Titanic");
        MovieFacade furious = new MovieFacadeImpl("Furious");

        titanic.watchMovie();
        titanic.endMovie();

        furious.watchMovie();
        furious.endMovie();
    }
}
