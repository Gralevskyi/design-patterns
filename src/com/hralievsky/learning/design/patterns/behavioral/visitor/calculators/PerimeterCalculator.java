package com.hralievsky.learning.design.patterns.behavioral.visitor.calculators;

import com.hralievsky.learning.design.patterns.behavioral.visitor.shapes.Circle;
import com.hralievsky.learning.design.patterns.behavioral.visitor.shapes.Rectangle;
import com.hralievsky.learning.design.patterns.behavioral.visitor.shapes.Triangle;

public class PerimeterCalculator implements Visitor {
    @Override
    public double visit(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    @Override
    public double visit(Rectangle rectangle) {
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }

    @Override
    public double visit(Triangle triangle) {
        // For a right triangle with base and height, we need to calculate the hypotenuse
        double hypotenuse = Math.sqrt(triangle.getBase() * triangle.getBase() +
                                      triangle.getHeight() * triangle.getHeight());
        return triangle.getBase() + triangle.getHeight() + hypotenuse;
    }
}
