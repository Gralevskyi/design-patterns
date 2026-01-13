package com.hralievsky.learning.design.patterns.structural.bridge.message;

import com.hralievsky.learning.design.patterns.structural.bridge.constants.PriorityLevel;
import com.hralievsky.learning.design.patterns.structural.bridge.delivery.Channel;

public class Alert implements Message {
    private final Channel channel;
    private final PriorityLevel priority;
    private final String content;

    public Alert(Channel channel, PriorityLevel priority, String content) {
        this.channel = channel;
        this.priority = priority;
        this.content = content;
    }

    @Override
    public String send() {
        return channel.send(priority.name() + " " + content);
    }
}
