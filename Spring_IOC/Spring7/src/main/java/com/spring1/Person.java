package com.spring1;
public class Person
{
	private int id;
	private String name;
	private long phno;
	
	private Mobile mob;   // Has-A relationship

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
	public Mobile getMob() {
		return mob;
	}
	public void setMob(Mobile mob) {
		this.mob = mob;
	}
}
