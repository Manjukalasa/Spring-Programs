package com.spring;

public class Employee
{
private int id;
private String name;
private long phno;

private Address address;  // Has-A relation


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getPhno() {
	return phno;
}

public void setPhno(long phno) {
	this.phno = phno;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

}
