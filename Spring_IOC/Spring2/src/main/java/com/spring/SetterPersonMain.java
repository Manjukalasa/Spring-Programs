package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SetterPersonMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person person=(Person)context.getBean("person1");

		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		System.out.println("==========================================================");
		Person person1=(Person)context.getBean("person2");
		System.out.println(person1.getId());
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		System.out.println(person1.getGender());
		System.out.println("==========================================================");
		Person person2=(Person)context.getBean("person3");
		System.out.println(person2.getId());
		System.out.println(person2.getName());
		System.out.println(person2.getAge());
		System.out.println(person2.getGender());
	}
}
