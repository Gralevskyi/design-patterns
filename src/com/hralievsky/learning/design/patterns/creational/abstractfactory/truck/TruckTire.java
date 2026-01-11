package com.hralievsky.learning.design.patterns.creational.abstractfactory.truck;

import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Tire;

public class TruckTire implements Tire {
    @Override
    public float getRadius() {
        return 75f;
    }
}
