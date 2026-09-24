package com.army;

import com.army.config.AppConfigFile;
import com.army.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    static void main()
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfigFile.class);
       OrderService service= context.getBean(OrderService.class);
       service.orderDetails();
    }
}
