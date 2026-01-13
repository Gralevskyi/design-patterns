package com.hralievsky.learning.design.patterns.structural.bridge.message;

import com.hralievsky.learning.design.patterns.structural.bridge.delivery.Channel;

import java.time.LocalDateTime;

public class Reminder implements Message {
    private final Channel channel;
    private final LocalDateTime scheduledTime;
    private final String content;

    public Reminder(Channel channel, LocalDateTime scheduledTime, String content) {
        this.channel = channel;
        this.scheduledTime = scheduledTime;
        this.content = content;
    }

    @Override
    public String send() {
        return channel.send(scheduledTime.toString() + " " + content);
    }
}
