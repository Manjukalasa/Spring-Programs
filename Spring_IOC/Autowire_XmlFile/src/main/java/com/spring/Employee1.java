package com.spring;

public class Employee1 {

private int id;
private String name;
private long phno;

private Address1 address;  // Has-A relation

public Employee1(int id, String name, long phno, Address1 address) {
	this.id = id;
	this.name = name;
	this.phno = phno;
	this.address = address;
}

@Override
public String toString() {
	return "Employee1 [id=" + id + ", name=" + name + ", phno=" + phno + ", address=" + address + "]";
}

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

public Address1 getAddress() {
	return address;
}

public void setAddress1(Address1 address) {
	this.address = address;
}

}
