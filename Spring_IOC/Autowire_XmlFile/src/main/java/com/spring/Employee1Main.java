package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee1Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config2.xml");// constructor
		Employee1 employee1=(Employee1)context.getBean("myempconst");
		System.out.println(employee1.getId());
		System.out.println(employee1.getName());
		System.out.println(employee1.getPhno());
		System.out.println(employee1.getAddress().getState());
		System.out.println(employee1.getAddress().getContry());
	}
}
