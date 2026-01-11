package com.hralievsky.learning.design.patterns.creational.singleton;

public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }

        }
        return singleton;
    }

    public void print() {
        System.out.println("Printing from Singleton " + singleton + " in thread: " + Thread.currentThread().getName());
    }
}
