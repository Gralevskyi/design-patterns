package com.hralievsky.learning.design.patterns.structural.bridge.delivery;

public class SMSChannel implements Channel {
    @Override
    public String send(String content) {
        return content.substring(0, Math.min(content.length(), 160));
    }
}
