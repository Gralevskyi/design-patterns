package com.hralievsky.learning.design.patterns.behavioral.state.states;

import com.hralievsky.learning.design.patterns.behavioral.state.shipping.Context;

public class Delivered implements State {
    @Override
    public void ship(Context context) {
        System.out.println(context.getName() + " is Delivered and can not be Shipped");
    }

    @Override
    public void cancel(Context context) {
        System.out.println(context.getName() + " is Delivered and can not be Cancelled");
    }

    @Override
    public void deliver(Context context) {
        System.out.println(context.getName() + " is Delivered and can not be Delivered");
    }

    @Override
    public String getStatus() {
        return "Delivered";
    }
}
