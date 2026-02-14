package com.hralievsky.learning.design.patterns.behavioral.observer.investor;

public class Investor implements Subscriber {
    private final String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void reactOnPriceChange(double newPrice) {
        System.out.println(name + " notifies that received the new price $" + newPrice);
    }
}
