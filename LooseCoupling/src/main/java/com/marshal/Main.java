package com.marshal;

import com.marshal.notification.NotifyByGmail;
import com.marshal.payment.PaymentByCreditCard;
import com.marshal.service.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    static void main()
    {
        OrderService oderService=new OrderService(new PaymentByCreditCard() , new NotifyByGmail());
        oderService.OrderDetails();
    }
}
