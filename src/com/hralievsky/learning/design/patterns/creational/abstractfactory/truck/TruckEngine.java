package com.hralievsky.learning.design.patterns.creational.abstractfactory.truck;

import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Engine;

public class TruckEngine implements Engine {

    @Override
    public float getCapacity() {
        return 7.5f;
    }
}
