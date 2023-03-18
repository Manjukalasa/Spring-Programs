package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalMain 
{
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Hospital hospital=(Hospital)context.getBean("myhospital");
		System.out.println(hospital.getId());
		System.out.println(hospital.getName());
		System.out.println(hospital.getWebsite());
		System.out.println(hospital.getBranch().getBid());
		System.out.println(hospital.getBranch().getBname());
		System.out.println(hospital.getBranch().getBlocation());
	}
} 
