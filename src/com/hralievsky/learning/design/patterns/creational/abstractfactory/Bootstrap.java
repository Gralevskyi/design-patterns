package com.hralievsky.learning.design.patterns.creational.abstractfactory;

import com.hralievsky.learning.design.patterns.creational.abstractfactory.factory.impl.CarDetailsFactory;
import com.hralievsky.learning.design.patterns.creational.abstractfactory.factory.impl.TruckDetailsFactory;

public class Bootstrap {
    public static void main(String[] args) {
        Application app;
        if (args.length == 0 || "truck".equals(args[0])) {
            app = new Application(new CarDetailsFactory());
        } else if ("car".equals(args[0])) {
            app = new Application(new TruckDetailsFactory());
        } else {
            throw new IllegalArgumentException("Not valid vehicle type.");
        }

        System.out.println("Engine capacity " + app.getEngine().getCapacity());
        System.out.println("Chassis weight " + app.getChassis().getWeight());
        System.out.println("Tire radius " + app.getTire().getRadius());
    }
}
