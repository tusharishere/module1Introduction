package com.codingshuttle.tushar.module1Introduction.Impl;

import com.codingshuttle.tushar.module1Introduction.NotificationService;
import com.sun.nio.sctp.Notification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsNotification")
@ConditionalOnProperty(name = "notification.type", havingValue ="sms")
public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("SMS Sending..."+message);
    }
}
