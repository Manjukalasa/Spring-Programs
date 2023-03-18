package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");// byName
	//	ApplicationContext context=new ClassPathXmlApplicationContext("config1.xml");// byType
		Employee employee=(Employee)context.getBean("myemp");
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getPhno());
		System.out.println(employee.getAddress().getState());
		System.out.println(employee.getAddress().getContry());
	}
}
