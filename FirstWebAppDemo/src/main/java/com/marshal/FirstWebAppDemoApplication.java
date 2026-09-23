package com.marshal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstWebAppDemoApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(FirstWebAppDemoApplication.class, args);
		System.out.println("Hello World ...");
	}

}
