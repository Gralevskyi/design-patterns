package com.hralievsky.learning.design.patterns.behavioral.state.states;

import com.hralievsky.learning.design.patterns.behavioral.state.shipping.Context;

public class Shipped implements State {
    @Override
    public void ship(Context context) {
        System.out.println(context.getName() + " cannot be shipped from Shipped status");
    }

    @Override
    public void cancel(Context context) {
        context.setState(new Cancelled());
        System.out.println(context.getName() + " canceled from Shipped status");
    }

    @Override
    public void deliver(Context context) {
        context.setState(new Delivered());
        System.out.println(context.getName() + " is delivered");
    }

    @Override
    public String getStatus() {
        return "Shipped";
    }
}
