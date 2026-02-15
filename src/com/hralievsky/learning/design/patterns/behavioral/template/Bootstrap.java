package com.hralievsky.learning.design.patterns.behavioral.template;

/**
 * Template Method Pattern: Beverage Preparation System
 * <p>
 * **Business Scenario**:
 * You're building a beverage preparation system for a café. Different beverages (tea, coffee) follow similar preparation steps, but some steps are implemented differently for each beverage.
 * <p>
 * **Requirements**:
 * <p>
 * 1. **Preparation Steps** (Template Method):
 * - Boil water (same for all)
 * - Brew (different: steep tea bag vs brew coffee grounds)
 * - Pour in cup (same for all)
 * - Add condiments (different: lemon for tea vs milk/sugar for coffee)
 * <p>
 * 2. **Beverage Types**:
 * - **Tea**: Steep tea bag, add lemon
 * - **Coffee**: Brew coffee grounds, add milk and sugar
 * <p>
 * 3. **Template Structure**:
 * - Abstract class defines preparation algorithm
 * - Subclasses implement specific steps
 * - Preparation order is fixed and controlled by template
 * <p>
 * **Behavior**:
 * - All beverages follow the same preparation sequence
 * - Common steps implemented in base class
 * - Specific steps implemented in subclasses
 * - Cannot change the preparation order
 * <p>
 * **Demo**:
 * - Prepare tea → prints all steps
 * - Prepare coffee → prints all steps
 * - Both follow same sequence but with different implementations
 * <p>
 * **Success Criteria**:
 * - Preparation algorithm defined once in abstract class
 * - Subclasses only override specific steps
 * - Cannot skip or reorder steps
 * - Easy to add new beverages (e.g., hot chocolate)
 */

public class Bootstrap {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepare();

        Coffee coffee = new Coffee();
        coffee.prepare();
    }
}
