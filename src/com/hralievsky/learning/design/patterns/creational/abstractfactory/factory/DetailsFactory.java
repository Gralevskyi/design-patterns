package com.hralievsky.learning.design.patterns.creational.abstractfactory.factory;

import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Chassis;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Engine;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.details.Tire;

public interface DetailsFactory {
    Engine getEngine();
    Chassis getChassis();
    Tire getTire();
}
