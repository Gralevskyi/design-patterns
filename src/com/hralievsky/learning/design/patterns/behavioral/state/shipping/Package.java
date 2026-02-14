package com.hralievsky.learning.design.patterns.behavioral.state.shipping;

import com.hralievsky.learning.design.patterns.behavioral.state.states.Ordered;
import com.hralievsky.learning.design.patterns.behavioral.state.states.State;

public class Package implements Context {
    private final String name;
    private State state;

    public Package(String name) {
        this.name = name;
        this.state = new Ordered();
        printStatus();
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setState(State newState) {
        this.state = newState;
    }

    public void ship() {
        state.ship(this);
        printStatus();
    }

    public void cancel() {
        state.cancel(this);
        printStatus();
    }

    public void deliver() {
        state.deliver(this);
        printStatus();
    }

    public void printStatus() {
        System.out.println(name + " is in status " + state.getStatus());
    }
}
