package com.hralievsky.learning.design.patterns.behavioral.visitor.shapes;

import com.hralievsky.learning.design.patterns.behavioral.visitor.calculators.Visitor;

public class Circle implements Shape {
    private final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
