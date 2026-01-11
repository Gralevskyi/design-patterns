package com.hralievsky.learning.design.patterns.creational.abstractfactory.factory.impl;

import com.hralievsky.learning.design.patterns.creational.abstractfactory.car.CarChassis;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.car.CarEngine;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.car.CarTire;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Chassis;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Engine;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Tire;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.factory.DetailsFactory;

public class CarDetailsFactory implements DetailsFactory {
    private Engine engine;
    private Tire tire;
    private Chassis chassis;

    public CarDetailsFactory() {
        this.engine = new CarEngine();
        this.chassis = new CarChassis();
        this.tire = new CarTire();
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
