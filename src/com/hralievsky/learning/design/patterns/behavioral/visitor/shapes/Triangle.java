package com.hralievsky.learning.design.patterns.behavioral.visitor.shapes;

import com.hralievsky.learning.design.patterns.behavioral.visitor.calculators.Visitor;

public class Triangle implements Shape {
    private final float base;
    private final float height;

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
