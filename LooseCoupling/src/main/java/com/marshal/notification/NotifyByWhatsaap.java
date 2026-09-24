package com.marshal.notification;

public class NotifyByWhatsaap implements Notification
{
    @Override
    public void notification()
    {
        System.out.println("Notification Done by WhatsApp");
    }
}
