package com.hralievsky.learning.design.patterns.behavioral.visitor.calculators;

import com.hralievsky.learning.design.patterns.behavioral.visitor.shapes.Circle;
import com.hralievsky.learning.design.patterns.behavioral.visitor.shapes.Rectangle;
import com.hralievsky.learning.design.patterns.behavioral.visitor.shapes.Triangle;

public class AreaCalculator implements Visitor {
    @Override
    public double visit(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public double visit(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWidth();
    }

    @Override
    public double visit(Triangle triangle) {
        return (triangle.getBase() * triangle.getHeight()) / 2;
    }
}
