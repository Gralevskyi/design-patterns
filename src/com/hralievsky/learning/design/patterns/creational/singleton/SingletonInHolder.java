package com.hralievsky.learning.design.patterns.creational.singleton;

public class SingletonInHolder {
    private SingletonInHolder() {

    }

    private static class SingletonHolder {
        private static SingletonInHolder INSTANCE = new SingletonInHolder();
    }

    public static SingletonInHolder getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void print() {
        System.out.println("Printing Singleton in Holder " + this.hashCode() + " through Thread " + Thread.currentThread().getName());
    }
}
