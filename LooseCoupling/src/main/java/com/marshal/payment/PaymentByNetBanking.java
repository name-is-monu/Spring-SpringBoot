package com.marshal.payment;

public class PaymentByNetBanking implements PaymentMethod
{

    @Override
    public void pay()
    {
        System.out.println("Payment Completed By NetBanking ..");

    }
}
