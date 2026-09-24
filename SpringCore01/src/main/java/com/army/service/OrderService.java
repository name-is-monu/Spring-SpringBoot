package com.army.service;

import com.army.notification.Notification;
import com.army.payment.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService
{
    @Autowired
    @Qualifier("notifyBySms")
    private Notification notification;

    @Autowired
    @Qualifier("paymentByCard")
    private PaymentMethod paymentMethod;

    public OrderService(){}

    //Constructor DI
   // @Autowired
//    public OrderService(Notification notification , PaymentMethod paymentMethod)
//    {
//        this.notification=notification;
//        this.paymentMethod=paymentMethod;
//    }

    //setter DI
//    @Autowired
//    public void setNotification(/*@Qualifier("notifyBySms")*/ Notification notification)
//    {
//        this.notification=notification;
//    }

//    @Autowired
//    public void setPaymentMethod(/*@Qualifier("paymentByCard")*/ PaymentMethod paymentMethod)
//    {
//        this.paymentMethod=paymentMethod;
//    }

    public void orderDetails()
    {
        paymentMethod.pay(4999.9);
        System.out.println("Order Delivered ....");
        notification.notifyBy();
    }
}

/*Agar Sirf Parameterised Constructor hai hamare class me aur default
ya no-arguments constructor nhi hai aur gar ma Parameterized constructor se
 Dependency Inject kar rhe hai to @Autowired nhi likhne par bhi ye automatic DI karega
 But agar ham no-arguments constructor bana dete hai to hame @Autowired constructor
 par lagana must ho jata hai mhi to Error aa jayega ..*/