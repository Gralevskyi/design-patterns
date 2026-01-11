package com.hralievsky.learning.design.patterns.creational.abstractfactory.truck;

import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Chassis;

public class TruckChassis implements Chassis {
    @Override
    public float getWeight() {
        return 3500.25f;
    }
}
