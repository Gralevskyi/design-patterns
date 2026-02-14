package com.hralievsky.learning.design.patterns.behavioral.state.states;

import com.hralievsky.learning.design.patterns.behavioral.state.shipping.Context;

public class Ordered implements State {
    @Override
    public void ship(Context context) {
        context.setState(new Shipped());
        System.out.println(context.getName() + " changed status from Ordered to Shipped");
    }

    @Override
    public void cancel(Context context) {
        context.setState(new Cancelled());
        System.out.println(context.getName() + " changed status from Ordered to Cancelled");
    }

    @Override
    public void deliver(Context context) {
        System.out.println(context.getName() + " cannot be delivered from Ordered status");
    }

    @Override
    public String getStatus() {
        return "Ordered";
    }
}
