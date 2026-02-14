package com.hralievsky.learning.design.patterns.behavioral.state;


import com.hralievsky.learning.design.patterns.behavioral.state.shipping.Package;

/**
 * State Pattern: Package Delivery Tracking
 * <p>
 * **Business Scenario**:
 * Package tracking system where a package transitions through delivery states.
 * <p>
 * **Package Lifecycle**:
 * Ordered → ship() → Shipped → deliver() → Delivered
 * ↓                  ↓
 * cancel()          cancel()
 * ↓                  ↓
 * Cancelled         Cancelled
 * <p>
 * **Requirements**:
 * <p>
 * 1. **Package States**:
 * - **Ordered**: Package prepared for shipping
 * - **Shipped**: Package in transit
 * - **Delivered**: Package reached destination
 * - **Cancelled**: Delivery cancelled
 * <p>
 * 2. **Actions**:
 * - **ship()**: Ordered → Shipped
 * - **deliver()**: Shipped → Delivered
 * - **cancel()**: Ordered/Shipped → Cancelled
 * - **getStatus()**: Display current state
 * <p>
 * 3. **Business Rules**:
 * - Ordered: can ship() or cancel()
 * - Shipped: can deliver() or cancel()
 * - Delivered: no actions allowed (final state)
 * - Cancelled: no actions allowed (final state)
 * <p>
 * **Demo**:
 * - Create package → "Ordered"
 * - ship() → "Shipped"
 * - deliver() → "Delivered"
 * - Try deliver() again → rejected (already delivered)
 * - Create package #2 → "Ordered"
 * - cancel() → "Cancelled"
 * - Try ship() → rejected (cancelled)
 * <p>
 * **Success Criteria**:
 * - Package behavior changes based on its state
 * - State transitions are encapsulated in state classes
 * - Adding new states doesn't require modifying Package class
 */
public class Bootstrap {

    public static void main(String[] args) {
        Package mobilePhone = new Package("Mobile Phone");
        mobilePhone.ship();
        mobilePhone.deliver();
        mobilePhone.deliver();

        Package laptop = new Package("Laptop");
        laptop.cancel();
        laptop.ship();
    }
}
