package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("config1.xml");
		Car car=(Car) context.getBean("mycar");


		System.out.println(car.getId());
		System.out.println(car.getCost());
		System.out.println(car.getBrandColor());
		System.out.println(car.getBrandColor().getClass());
	}

}
