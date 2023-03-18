package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person peson=(Person) context.getBean("myperson");


		System.out.println(peson.getId());
		System.out.println(peson.getName());
		System.out.println(peson.getPhno());
		System.out.println(peson.getPhno().getClass());
	}

}
