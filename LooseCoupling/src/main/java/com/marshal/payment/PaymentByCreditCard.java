package com.marshal.payment;

public class PaymentByCreditCard implements PaymentMethod
{
    @Override
    public void pay()
    {
        System.out.println("Payment Completed By Credit Card ..");

    }
}
