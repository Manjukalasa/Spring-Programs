package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");
		Person p1  = (Person) context.getBean("myperson");
		System.out.println(p1);
		System.out.println(p1.hashCode());//scope="prototype" -->1.singleton(implicitly)  2.prototype(explicitly)
		
		Person p2  = (Person) context.getBean("myperson");
		System.out.println(p2);
		System.out.println(p2.hashCode());

	}

}