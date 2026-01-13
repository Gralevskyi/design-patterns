package com.hralievsky.learning.design.patterns.structural.bridge;

import com.hralievsky.learning.design.patterns.structural.bridge.constants.PriorityLevel;
import com.hralievsky.learning.design.patterns.structural.bridge.delivery.Channel;
import com.hralievsky.learning.design.patterns.structural.bridge.delivery.EmailChannel;
import com.hralievsky.learning.design.patterns.structural.bridge.delivery.PushChannel;
import com.hralievsky.learning.design.patterns.structural.bridge.delivery.SMSChannel;
import com.hralievsky.learning.design.patterns.structural.bridge.message.Alert;
import com.hralievsky.learning.design.patterns.structural.bridge.message.Newsletter;
import com.hralievsky.learning.design.patterns.structural.bridge.message.Reminder;

import java.time.LocalDateTime;
import java.util.List;

public class Bootstrap {
    public static void main(String[] args) {
        Channel smsChannel = new SMSChannel();
        Channel emailChannel = new EmailChannel();
        Channel pushChannel = new PushChannel();


        Alert alert = new Alert(smsChannel, PriorityLevel.MEDIUM, "Get up to go on the walk. Don't miss your training. " +
                                                                  "Each day is very important. See you on our usual place. " +
                                                                  "This message is long because of test purpose Buy.");
        Newsletter newsletter = new Newsletter(emailChannel, "New Year", "Peace in Ukraine on New Year", List.of("ogralievskyi@gamil.com"));
        Reminder reminder = new Reminder(pushChannel, LocalDateTime.of(2026, 01, 12, 20, 00), "Go to walk");
        Alert alert2 = new Alert(emailChannel, PriorityLevel.HIGH, "Check the app health on production server");

        System.out.println(alert.send());
        System.out.println(alert2.send());
        System.out.println(reminder.send());
        System.out.println(newsletter.send());
    }
}
