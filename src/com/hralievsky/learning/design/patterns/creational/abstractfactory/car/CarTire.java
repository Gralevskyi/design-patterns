package com.hralievsky.learning.design.patterns.creational.abstractfactory.car;

import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Tire;

public class CarTire implements Tire {

    @Override
    public float getRadius() {
        return 55;
    }
}
