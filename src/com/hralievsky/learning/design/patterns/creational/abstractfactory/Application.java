package com.hralievsky.learning.design.patterns.creational.abstractfactory;

import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Chassis;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Engine;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Tire;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.factory.DetailsFactory;

public class Application {
    private DetailsFactory factory;

    public Application(DetailsFactory factory) {
        this.factory = factory;
    }

    public Engine getEngine() {
        return factory.getEngine();
    }

    public Tire getTire() {
        return factory.getTire();
    }

    public Chassis getChassis() {
        return factory.getChassis();
    }

}
