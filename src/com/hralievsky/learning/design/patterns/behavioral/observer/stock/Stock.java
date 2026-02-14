package com.hralievsky.learning.design.patterns.behavioral.observer.stock;

import com.hralievsky.learning.design.patterns.behavioral.observer.investor.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Publisher {
    private double price;
    private List<Subscriber> subscribers = new ArrayList<>();

    public Stock(double price) {
        this.price = price;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void setNewPrice(double newPrice) {
        this.price = newPrice;
        publishPriceChange();
    }

    @Override
    public void publishPriceChange() {
        subscribers.forEach(subscriber -> subscriber.reactOnPriceChange(this.price));
    }
}
