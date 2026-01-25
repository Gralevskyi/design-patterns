package com.hralievsky.learning.design.patterns.structural.decorator.decorators;

import com.hralievsky.learning.design.patterns.structural.decorator.Beverage;

import java.math.BigDecimal;

public class CaramelSyrup extends BeverageDecorator {

    public CaramelSyrup(Beverage beverage) {
        super(beverage);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(BigDecimal.valueOf(1.1));
    }

    @Override
    public String getName() {
        return super.getName() + " CaramelSyrup";
    }

}
