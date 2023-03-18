package com.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PersonMain {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("config.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Person person=(Person)factory.getBean("person1");
		System.out.println(person);
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
	}
}
