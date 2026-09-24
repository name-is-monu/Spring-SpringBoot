package com.marshal.service;

import com.marshal.notification.Notification;
import com.marshal.payment.PaymentMethod;

public class OrderService
{
    private PaymentMethod paymentBy;
    private Notification notification;

    public OrderService(PaymentMethod paymentBy , Notification notification)
    {
        this.paymentBy=paymentBy;
        this.notification=notification;

    }


    public void OrderDetails()
    {
        paymentBy.pay();
        System.out.println("Order Delivered ");
        notification.notification();
    }
}
