package com.hralievsky.learning.design.patterns.behavioral.observer;


import com.hralievsky.learning.design.patterns.behavioral.observer.investor.Investor;
import com.hralievsky.learning.design.patterns.behavioral.observer.stock.Stock;

/**
 * **Task**: Build a stock monitoring system where investors automatically get notified when stock prices change.
 * <p>
 * **Requirements**:
 * <p>
 * 1. **Stock** (Subject):
 * - Has a price
 * - Price can be updated
 * - Notifies all subscribers when price changes
 * <p>
 * 2. **Investor** (Observer):
 * - Subscribes to stocks
 * - Receives price update notifications
 * - Displays the new price
 * <p>
 * 3. **Behavior**:
 * - Multiple investors can subscribe to the same stock
 * - Investors can unsubscribe
 * - When price changes → all subscribers get notified automatically
 * <p>
 * **Demo**:
 * - Create stock AAPL at $150
 * - 2 investors subscribe to AAPL
 * - Update price to $155 → both investors get notified
 * - 1 investor unsubscribes
 * - Update price to $160 → only 1 investor notified
 */
public class Bootstrap {

    public static void main(String[] args) {
        Stock aapl = new Stock(150);

        Investor firstInvestor = new Investor("First Investor");
        aapl.subscribe(firstInvestor);

        Investor secondInvestor = new Investor("Second Investor");
        aapl.subscribe(secondInvestor);

        aapl.setNewPrice(155);

        aapl.unsubscribe(secondInvestor);

        aapl.setNewPrice(160);
    }
}
