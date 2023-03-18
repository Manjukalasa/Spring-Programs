package com.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Car car=(Car)context.getBean("mycar");
		System.out.println(car);
		context.registerShutdownHook();	
	}
}
