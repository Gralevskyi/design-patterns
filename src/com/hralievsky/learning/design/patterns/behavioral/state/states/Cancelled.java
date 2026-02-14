package com.hralievsky.learning.design.patterns.behavioral.state.states;

import com.hralievsky.learning.design.patterns.behavioral.state.shipping.Context;

public class Cancelled implements State {
    @Override
    public void ship(Context context) {
        System.out.println(context.getName() + " is Cancelled and can not be shipped");
    }

    @Override
    public void cancel(Context context) {
        System.out.println(context.getName() + " is Cancelled and can not be cancelled");
    }

    @Override
    public void deliver(Context context) {
        System.out.println(context.getName() + " is Cancelled and can not be delivered");
    }

    @Override
    public String getStatus() {
        return "Cancelled";
    }
}
