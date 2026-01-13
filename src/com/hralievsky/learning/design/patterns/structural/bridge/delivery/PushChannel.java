package com.hralievsky.learning.design.patterns.structural.bridge.delivery;

public class PushChannel implements Channel {
    @Override
    public String send(String content) {
        return content + " device token: 12345 ";
    }
}
