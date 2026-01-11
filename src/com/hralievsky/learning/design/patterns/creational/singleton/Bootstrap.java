package com.hralievsky.learning.design.patterns.creational.singleton;

public class Bootstrap {
    public static void main(String[] args) {
        Runnable task = () -> {
            Singleton singleton = Singleton.getInstance();
            singleton.print();
        };

        Runnable task2 = () -> {
            Singleton singleton2 = Singleton.getInstance();
            singleton2.print();
        };

        Runnable task3 = () -> {
            Singleton singleton3 = Singleton.getInstance();
            singleton3.print();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t2.start();
        t3.start();


        Runnable task4 = () -> {
            SingletonInHolder singletonInHolder = SingletonInHolder.getInstance();
            singletonInHolder.print();
        };

        Runnable task5 = () -> {
            SingletonInHolder singletonInHolder2 = SingletonInHolder.getInstance();
            singletonInHolder2.print();
        };

        Thread t4 = new Thread(task4);
        Thread t5 = new Thread(task5);

        t4.start();
        t5.start();
    }
}
