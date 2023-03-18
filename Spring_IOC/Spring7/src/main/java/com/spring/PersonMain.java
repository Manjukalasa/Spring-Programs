package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain 
{
		public static void main(String[] args)
		{			
			ApplicationContext context1=new ClassPathXmlApplicationContext("config.xml");
			Person person=(Person)context1.getBean("myperson");
		
			System.out.println("----------------------------------------------------------------------------");
			System.out.println(person.getId());
			System.out.println(person.getName());
			System.out.println(person.getAge());
			System.out.println(person.getGender());
			System.out.println(person.getPhno());
			System.out.println("Person adhar id is: "+person.getCard().getId());
			System.out.println("Person adhar address is: "+person.getCard().getAddress());
			System.out.println("==========================================================");
	}
}
