package com.hralievsky.learning.design.patterns.behavioral.template;

public abstract class Beverage {

    public void prepare() {
        System.out.println("Preparing " + this.getClass().getSimpleName());
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        System.out.println("Done Preparing " + this.getClass().getSimpleName() + "\n");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring cup");
    }

    abstract void addCondiments();
}
