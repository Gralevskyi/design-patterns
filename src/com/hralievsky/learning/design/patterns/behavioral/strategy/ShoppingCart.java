package com.hralievsky.learning.design.patterns.behavioral.strategy;

import com.hralievsky.learning.design.patterns.behavioral.strategy.payment.PaymentStrategy;

public class ShoppingCart {
    private final double totalAmount;
    private PaymentStrategy strategy;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setStrategy(PaymentStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy cannot be null");
        }
        this.strategy = strategy;
    }

    public void checkout() {
        strategy.pay(totalAmount);
    }

}
