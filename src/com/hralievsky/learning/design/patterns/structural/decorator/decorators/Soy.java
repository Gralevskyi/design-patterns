package com.hralievsky.learning.design.patterns.structural.decorator.decorators;

import com.hralievsky.learning.design.patterns.structural.decorator.Beverage;

import java.math.BigDecimal;

public class Soy extends BeverageDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    public BigDecimal cost() {
        return super.getCost().subtract(BigDecimal.valueOf(0.3));
    }

    public String getName() {
        return super.getName() + " Soy";
    }
}
