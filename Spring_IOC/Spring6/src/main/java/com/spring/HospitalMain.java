package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalMain {
		public static void main(String[] args)
		{
//			ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");  // setter Injection(without constructor)
//			Hospital hospital=(Hospital)context.getBean("hospital");
//			System.out.println("---------------------------------Using Setter Injection--------------------------");
			
			ApplicationContext context1=new ClassPathXmlApplicationContext("config1.xml");  // constructor Injection(with constructor)
			Hospital1 hospital=(Hospital1)context1.getBean("hospital2");
			System.out.println("------------------------------ --Using Constructor Injection-------------------------");
			
			
			System.out.println(hospital);
			System.out.println("----------------------------------------------------------------------------");
			System.out.println(hospital.getId());
			System.out.println(hospital.getName());
			System.out.println(hospital.getWebsite());
			System.out.println(hospital.getPhno());
			System.out.println(hospital.getBnameloc());
			System.out.println("==========================================================");
	}
}
