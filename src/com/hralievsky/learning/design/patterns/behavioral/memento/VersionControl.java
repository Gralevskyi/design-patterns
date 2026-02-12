package com.hralievsky.learning.design.patterns.behavioral.memento;

import java.util.Stack;

public class VersionControl {
    private Stack<Memento> mementos = new Stack<>();

    private VersionControl() {
    }

    public static VersionControl create() {
        return new VersionControl();
    }

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento pop() {
        return mementos.pop();
    }
}
