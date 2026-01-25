package com.hralievsky.learning.design.patterns.structural.decorator.beverages;

import com.hralievsky.learning.design.patterns.structural.decorator.Beverage;

import java.math.BigDecimal;

public class DarkRoast implements Beverage {
    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(4);
    }

    @Override
    public String getName() {
        return "DarkRoast";
    }
}
