package com.hralievsky.learning.design.patterns.behavioral.state.states;

import com.hralievsky.learning.design.patterns.behavioral.state.shipping.Context;

public interface State {
    void ship(Context context);

    void cancel(Context context);

    void deliver(Context context);

    String getStatus();
}
