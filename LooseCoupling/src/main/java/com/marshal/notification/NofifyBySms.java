package com.marshal.notification;

public class NofifyBySms implements Notification
{

    @Override
    public void notification()
    {
        System.out.println("Notification Done By SMS ..");
    }
}
