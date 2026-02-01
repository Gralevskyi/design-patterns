package com.hralievsky.learning.design.patterns.structural.proxy.user;

public class Guest implements User {
    private final int id;
    private static final UserRole role = UserRole.GUEST;

    public Guest(int id) {
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
