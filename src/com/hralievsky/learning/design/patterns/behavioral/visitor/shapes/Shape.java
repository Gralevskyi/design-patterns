package com.hralievsky.learning.design.patterns.behavioral.visitor.shapes;

import com.hralievsky.learning.design.patterns.behavioral.visitor.calculators.Visitor;

public interface Shape {

    double accept(Visitor visitor);
}
