package com.hralievsky.learning.design.patterns.structural.decorator.beverages;

import com.hralievsky.learning.design.patterns.structural.decorator.Beverage;

import java.math.BigDecimal;

public class Espresso implements Beverage {
    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(2.5);
    }

    @Override
    public String getName() {
        return "Espresso";
    }
}
