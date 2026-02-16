package com.hralievsky.learning.design.patterns.behavioral.visitor.shapes;

import com.hralievsky.learning.design.patterns.behavioral.visitor.calculators.Visitor;

public class Rectangle implements Shape {
    private final float width;
    private final float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
