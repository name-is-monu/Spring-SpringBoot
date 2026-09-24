package com.marshal.notification;

public class NotifyByGmail implements Notification
{
    @Override
    public void notification()
    {
        System.out.println("Notification Done By Gmail..");
    }
}
