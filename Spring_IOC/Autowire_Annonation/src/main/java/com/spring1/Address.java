package com.spring1;

public class Address 
{
	private int id ;
	private String state;
	private String country;
	
	
	public Address(int id, String state, String country) {
		super();
		this.id = id;
		this.state = state;
		this.country = country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", state=" + state + ", country=" + country + "]";
	}
	
}