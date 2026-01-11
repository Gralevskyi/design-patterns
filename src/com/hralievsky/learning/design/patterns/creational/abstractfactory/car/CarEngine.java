package com.hralievsky.learning.design.patterns.creational.abstractfactory.car;

import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Engine;

public class CarEngine implements Engine {

    @Override
    public float getCapacity() {
        return 2.5f;
    }
}
