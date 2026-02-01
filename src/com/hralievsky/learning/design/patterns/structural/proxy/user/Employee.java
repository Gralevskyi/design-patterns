package com.hralievsky.learning.design.patterns.structural.proxy.user;

public class Employee implements User {
    private final int id;
    private static final UserRole role = UserRole.EMPLOYEE;


    public Employee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public UserRole getRole() {
        return role;
    }
}
