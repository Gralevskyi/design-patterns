package com.hralievsky.learning.design.patterns.structural.bridge.delivery;

public class EmailChannel implements Channel {


    @Override
    public String send(String content) {
        return "To: [email] " + content;
    }
}
