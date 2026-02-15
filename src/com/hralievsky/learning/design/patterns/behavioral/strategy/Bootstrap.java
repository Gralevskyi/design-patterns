package com.hralievsky.learning.design.patterns.behavioral.strategy;

import com.hralievsky.learning.design.patterns.behavioral.strategy.payment.CreditCardPayment;
import com.hralievsky.learning.design.patterns.behavioral.strategy.payment.CryptocurrencyPayment;
import com.hralievsky.learning.design.patterns.behavioral.strategy.payment.PayPalPayment;

/**
 * You're building a checkout system for an e-commerce platform. Customers can pay using different payment methods, and each method has its own processing logic.
 * <p>
 * **Requirements**:
 * <p>
 * 1. **Payment Methods** (Strategies):
 * - **Credit Card**: Process with card number and CVV
 * - **PayPal**: Process with email address
 * - **Cryptocurrency**: Process with wallet address
 * <p>
 * 2. **Shopping Cart** (Context):
 * - Stores total amount to pay
 * - Can set/change payment method at any time
 * - Executes payment using selected method
 * <p>
 * 3. **Behavior**:
 * - Each payment method validates and processes differently
 * - Customer can switch payment method before checkout
 * - All methods should print processing details
 * <p>
 * **Demo**:
 * - Create cart with $100
 * - Set Credit Card payment → process
 * - Switch to PayPal → process same cart
 * - Create another cart with $250
 * - Set Cryptocurrency payment → process
 * <p>
 * **Success Criteria**:
 * - Payment logic encapsulated in strategy classes
 * - Easy to add new payment methods without modifying cart
 * - Cart works with any payment strategy through common interface
 */

public class Bootstrap {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(100.00);
        cart.setStrategy(new CreditCardPayment());
        cart.checkout();

        cart.setStrategy(new PayPalPayment());
        cart.checkout();

        ShoppingCart cart2 = new ShoppingCart(250.00);
        cart2.setStrategy(new CryptocurrencyPayment());
        cart2.checkout();
    }
}
