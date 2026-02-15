
package com.hralievsky.learning.design.patterns.behavioral.strategy.payment;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pay with PayPal $" + amount);
    }
}
