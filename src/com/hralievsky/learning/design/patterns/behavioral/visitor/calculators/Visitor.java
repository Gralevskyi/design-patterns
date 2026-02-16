package com.hralievsky.learning.design.patterns.behavioral.visitor.calculators;

import com.hralievsky.learning.design.patterns.behavioral.visitor.shapes.Circle;
import com.hralievsky.learning.design.patterns.behavioral.visitor.shapes.Rectangle;
import com.hralievsky.learning.design.patterns.behavioral.visitor.shapes.Triangle;

public interface Visitor {
    double visit(Circle circle);

    double visit(Rectangle rectangle);

    double visit(Triangle triangle);
}
