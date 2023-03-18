package com.spring;

public class Address1
{
	private String state;
	private String contry;

	public Address1(String state, String contry) {
		this.state = state;
		this.contry = contry;
	}

	@Override
	public String toString() {
		return "Address1 [state=" + state + ", contry=" + contry + "]";
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	
}
