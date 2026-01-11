package com.hralievsky.learning.design.patterns.creational.abstractfactory.car;

import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Chassis;

public class CarChassis implements Chassis {
    @Override
    public float getWeight() {
        return 1200.50f;
    }
}
