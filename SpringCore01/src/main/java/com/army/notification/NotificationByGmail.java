package com.army.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class NotificationByGmail implements  Notification
{

    @Override
    public void notifyBy()
    {
        System.out.println("Notification Done By Gmail ..");
    }
}
