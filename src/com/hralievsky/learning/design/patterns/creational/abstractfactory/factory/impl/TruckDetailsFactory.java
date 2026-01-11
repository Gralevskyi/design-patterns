package com.hralievsky.learning.design.patterns.creational.abstractfactory.factory.impl;

import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Chassis;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Engine;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Tire;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.factory.DetailsFactory;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.truck.TruckChassis;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.truck.TruckEngine;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.truck.TruckTire;

public class TruckDetailsFactory implements DetailsFactory {
    private Tire tire;
    private Engine engine;
    private Chassis chassis;

    public TruckDetailsFactory() {
        this.tire = new TruckTire();
        this.engine = new TruckEngine();
        this.chassis = new TruckChassis();
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public Chassis getChassis() {
        return chassis;
    }

    @Override
    public Tire getTire() {
        return tire;
    }
}
