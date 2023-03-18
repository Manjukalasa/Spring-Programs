package com.spring1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value ="emp")  // bean automatically created
public class Employee
{
	@Value(value="111")   // set value
	private int id;
	@Value(value="Manju")
	private String name;
	@Value(value="23")
	private int age;
	@Value(value="55000")
	private int salary;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
