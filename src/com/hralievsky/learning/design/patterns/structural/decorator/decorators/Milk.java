package com.hralievsky.learning.design.patterns.structural.decorator.decorators;

import com.hralievsky.learning.design.patterns.structural.decorator.Beverage;

import java.math.BigDecimal;

public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(BigDecimal.valueOf(0.2));
    }

    @Override
    public String getName() {
        return super.getName() + " Milk";
    }

}
