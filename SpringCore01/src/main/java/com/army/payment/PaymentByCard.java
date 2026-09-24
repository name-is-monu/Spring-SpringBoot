package com.army.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier
public class PaymentByCard implements PaymentMethod
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Payment Done by Card amount :"+amount);
    }
}
