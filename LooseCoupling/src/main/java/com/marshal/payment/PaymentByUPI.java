package com.marshal.payment;

public class PaymentByUPI implements PaymentMethod
{

    @Override
    public void pay()
    {
        System.out.println("Payment Completed By UPI");

    }
}
