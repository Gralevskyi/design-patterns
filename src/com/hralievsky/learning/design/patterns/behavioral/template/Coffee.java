package com.hralievsky.learning.design.patterns.behavioral.template;

public class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("Coffee brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Add milk and sugar");
    }
}
