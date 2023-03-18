package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Country country=(Country)context.getBean("country1");
		System.out.println(country);
		System.out.println(country.getId());
		System.out.println(country.getName());
		System.out.println(country.getPm());
		System.out.println(country.getPopulation());
		System.out.println(country.getStates());
		System.out.println("==========================================================");
		Country country1=(Country)context.getBean("country2");
		System.out.println(country1);
		System.out.println(country1.getId());
		System.out.println(country1.getName());
		System.out.println(country1.getPm());
		System.out.println(country1.getPopulation());
		System.out.println(country1.getStates());
		System.out.println("==========================================================");

	}

}
