package com.hralievsky.learning.design.patterns.behavioral.visitor;

import com.hralievsky.learning.design.patterns.behavioral.visitor.calculators.AreaCalculator;
import com.hralievsky.learning.design.patterns.behavioral.visitor.calculators.PerimeterCalculator;
import com.hralievsky.learning.design.patterns.behavioral.visitor.calculators.Visitor;
import com.hralievsky.learning.design.patterns.behavioral.visitor.shapes.Circle;
import com.hralievsky.learning.design.patterns.behavioral.visitor.shapes.Rectangle;
import com.hralievsky.learning.design.patterns.behavioral.visitor.shapes.Triangle;

/**
 * Visitor Pattern: Shape Area Calculator
 * <p>
 * **Business Scenario**:
 * You have different shapes (Circle, Rectangle, Triangle) and need to perform various operations on them (calculate area, calculate perimeter) without modifying the shape classes.
 * <p>
 * **Requirements**:
 * <p>
 * 1. **Shapes** (Elements):
 * - **Circle**: has radius
 * - **Rectangle**: has width and height
 * - **Triangle**: has three sides
 * <p>
 * 2. **Operations** (Visitors):
 * - **Area Calculator**: calculates area for each shape
 * - **Perimeter Calculator**: calculates perimeter for each shape
 * <p>
 * 3. **Behavior**:
 * - Each visitor implements calculation logic for all shapes
 * - Shapes accept visitors without knowing operation details
 * - Easy to add new operations without modifying shape classes
 * <p>
 * **Demo**:
 * - Create circle (radius=5), rectangle (4x6), triangle (3,4,5)
 * - Apply area calculator → prints all areas
 * - Apply perimeter calculator → prints all perimeters
 * <p>
 * **Success Criteria**:
 * - Shape classes don't contain calculation logic
 * - New operations can be added without modifying shapes
 * - Each visitor handles all shape types
 * - Uses double dispatch mechanism
 */

public class Bootstrap {

    static void print(String shapeName, double value) {
        System.out.println(shapeName + ": " + value);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4);

        System.out.println("=== Area Calculation ===");
        Visitor areaCalculator = new AreaCalculator();
        print(circle.getClass().getSimpleName(), circle.accept(areaCalculator));
        print(rectangle.getClass().getSimpleName(), rectangle.accept(areaCalculator));
        print(triangle.getClass().getSimpleName(), triangle.accept(areaCalculator));

        System.out.println("\n=== Perimeter Calculation ===");
        Visitor perimeterCalculator = new PerimeterCalculator();
        print(circle.getClass().getSimpleName(), circle.accept(perimeterCalculator));
        print(rectangle.getClass().getSimpleName(), rectangle.accept(perimeterCalculator));
        print(triangle.getClass().getSimpleName(), triangle.accept(perimeterCalculator));
    }
}
