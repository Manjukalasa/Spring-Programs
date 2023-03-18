package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class constructorPersonMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person1 person1=(Person1)context.getBean("per1");
		System.out.println(person1);
		System.out.println(person1.getPid());
		System.out.println(person1.getPname());
		System.out.println(person1.getPage());
		System.out.println(person1.getPgender());
		System.out.println("=================================================");
		Person1 person2=(Person1)context.getBean("per2");
		System.out.println(person2);
		System.out.println("=================================================");
		Person1 person3=(Person1)context.getBean("per3");
		System.out.println(person3);
	}
}
