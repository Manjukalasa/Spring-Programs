package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain 
{
  public static void main(String[] args)
  {			
	ApplicationContext context=new ClassPathXmlApplicationContext("config1.xml");
	Person person=(Person)context.getBean("myperson");
		
	System.out.println("-----------------😍welcome😍------------------------");
	System.out.println(person.getId());
    System.out.println(person.getName());
    System.out.println(person.getPhno());
	System.out.println("------------------------------------------------------");
	System.out.println(person.getMob().getId());
	System.out.println(person.getMob().getBrand());
	System.out.println(person.getMob().getCostColor());
    System.out.println("-------------------------------------------------------");
    System.out.println(person.getMob().getAma().getOrderid());
    System.out.println(person.getMob().getAma().getQuantity());
	System.out.println(person.getMob().getAma().getCost());
	System.out.println(person.getMob().getAma().getItem());
	}
}
