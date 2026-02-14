package com.hralievsky.learning.design.patterns.behavioral.observer.investor;

public interface Subscriber {
    void reactOnPriceChange(double newPrice);
}
