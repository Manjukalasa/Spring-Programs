package com.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person 
{
	@Autowired 
	@Qualifier("myaddress1")
	private Address address;

	//@Autowired   // execution start from here
	public Person(Address address) {
		this.address = address;
		System.out.println("start from constr injection");
	}
	public Person() {
		super();
	}

	public Address getAddress() {
		return address;	
	}
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("start from setter injection");
	}
	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}
}