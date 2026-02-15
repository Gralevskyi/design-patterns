
package com.hralievsky.learning.design.patterns.behavioral.strategy.payment;

public class CryptocurrencyPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pay with Cryptocurrency $" + amount);
    }
}
