package com.hralievsky.learning.design.patterns.structural.decorator;

import com.hralievsky.learning.design.patterns.structural.decorator.beverages.Decaf;
import com.hralievsky.learning.design.patterns.structural.decorator.beverages.Espresso;
import com.hralievsky.learning.design.patterns.structural.decorator.beverages.HouseBlend;
import com.hralievsky.learning.design.patterns.structural.decorator.decorators.CaramelSyrup;
import com.hralievsky.learning.design.patterns.structural.decorator.decorators.ExtraShot;
import com.hralievsky.learning.design.patterns.structural.decorator.decorators.Milk;
import com.hralievsky.learning.design.patterns.structural.decorator.decorators.Mocha;
import com.hralievsky.learning.design.patterns.structural.decorator.decorators.Soy;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a beverage ordering system for a coffee shop. The system should support:
 * <p>
 * 1. Base beverages (Espresso, HouseBlend, Decaf, DarkRoast) - each with a name and base cost
 * 2. Optional add-ons that customers can choose (Milk, Soy, Mocha, Whip, CaramelSyrup, ExtraShot) - each adds to the total cost
 * 3. Customers can add multiple add-ons to any beverage (e.g., Espresso with Milk, Mocha, and Whip)
 * 4. The system must calculate the total cost of the beverage with all selected add-ons
 * 5. The system must generate a complete description showing the base beverage and all add-ons
 * <p>
 * Demonstrate with examples showing:
 * - Simple beverage orders (just the base)
 * - Complex orders with multiple add-ons
 * - Same base beverage with different combinations of add-ons
 * - Total price calculation for each order
 **/

public class Bootstrap {

    public static void main(String[] args) {

        List<Beverage> beverages = new ArrayList<>();

        Beverage espresso = new Espresso();
        beverages.add(espresso);
        Beverage espressoWithMilk = new Milk(new Espresso());
        beverages.add(espressoWithMilk);
        Beverage decafWithSyrupAndSoy = new Soy(new CaramelSyrup(new Decaf()));
        beverages.add(decafWithSyrupAndSoy);
        Beverage houseBlendWithExtraShotAndMocha = new Mocha(new ExtraShot(new HouseBlend()));
        beverages.add(houseBlendWithExtraShotAndMocha);

        beverages.forEach(beverage ->
                System.out.println(beverage.getName() + " costs " + beverage.getCost() + "$"));

        /*
        result:
        Espresso costs 2.5$
        Espresso Milk costs 2.7$
        Decaf CaramelSyrup Soy costs 4.6$
        HouseBlend ExtraShot Mocha costs 5.2$
         */
    }
}
