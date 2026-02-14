package com.hralievsky.learning.design.patterns.behavioral.state.shipping;

import com.hralievsky.learning.design.patterns.behavioral.state.states.State;

public interface Context {
    String getName();
    void setState(State newState);

}
