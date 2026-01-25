package com.hralievsky.learning.design.patterns.structural.decorator.decorators;

import com.hralievsky.learning.design.patterns.structural.decorator.Beverage;

import java.math.BigDecimal;

public abstract class BeverageDecorator implements Beverage {
    private Beverage wrappee;

    BeverageDecorator(Beverage wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public BigDecimal getCost() {
        return wrappee.getCost();
    }

    @Override
    public String getName() {
        return wrappee.getName();
    }
}
