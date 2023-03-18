package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ColleageMain {

	public static void main(String[] args) 
	{
		ApplicationContext context1=new ClassPathXmlApplicationContext("config.xml");
		Colleage colleage=(Colleage)context1.getBean("mycolleage");
	
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(colleage.getId());
		System.out.println(colleage.getName());
		System.out.println(colleage.getWebsite());
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(colleage.getBranch().getId());
		System.out.println(colleage.getBranch().getCourse());
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(colleage.getStudent().getId());
		System.out.println(colleage.getStudent().getName());
		System.out.println(colleage.getStudent().getSubMarks());
	}

}
