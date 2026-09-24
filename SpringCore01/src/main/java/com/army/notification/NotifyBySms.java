package com.army.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier
public class NotifyBySms implements Notification
{
    @Override
    public void notifyBy()
    {
        System.out.println("Notification By Sms :");
    }
}
