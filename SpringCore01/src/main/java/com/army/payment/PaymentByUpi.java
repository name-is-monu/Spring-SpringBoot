package com.army.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PaymentByUpi implements PaymentMethod
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Payment Done By UPI amount :"+amount);
    }
}
