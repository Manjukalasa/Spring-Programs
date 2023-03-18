package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationEmployee {

	public static void main(String[] args)
	{
	ApplicationContext context= new AnnotationConfigApplicationContext("com.spring1");
	
	Employee employee=(Employee)context.getBean("emp");
	System.out.println(employee);
	System.out.println(employee.getId());
	System.out.println(employee.getName());
	System.out.println(employee.getAge());
	System.out.println(employee.getSalary());
	}
}
