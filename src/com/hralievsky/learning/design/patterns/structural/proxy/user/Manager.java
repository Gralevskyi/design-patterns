package com.hralievsky.learning.design.patterns.structural.proxy.user;

public class Manager implements User {
    private final int id;
    private static final UserRole role = UserRole.MANAGER;


    public Manager(int id) {
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
