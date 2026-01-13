package com.hralievsky.learning.design.patterns.structural.bridge.message;

import com.hralievsky.learning.design.patterns.structural.bridge.delivery.Channel;

import java.util.List;

public class Newsletter implements Message {
    private final Channel channel;
    private final String subject;
    private final String content;
    private final List<String> recipients;

    public Newsletter(Channel channel, String subject, String content, List<String> recipients) {
        this.channel = channel;
        this.subject = subject;
        this.content = content;
        this.recipients = recipients;
    }

    @Override
    public String send() {
        return channel.send(subject + " " + content + " " + recipients);
    }
}
