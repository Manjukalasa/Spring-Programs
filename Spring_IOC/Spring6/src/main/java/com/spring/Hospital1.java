package com.spring;

import java.util.Map;

public class Hospital1
{
	private int id;
	private String name;
	private String website;
	private long phno;
	private Map<String ,String> bnameloc;
	
	// when constructor injection using that time use constructor
	public Hospital1(int id, String name, String website, long phno, Map<String, String> bnameloc)
	{
		this.id = id;
		this.name = name;
		this.website = website;
		this.phno = phno;
		this.bnameloc = bnameloc;
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public Map<String, String> getBnameloc() {
		return bnameloc;
	}
	public void setBnameloc(Map<String, String> bnameloc) {
		this.bnameloc = bnameloc;
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", website=" + website + ", phno=" + phno + ", bnameloc="
				+ bnameloc + "]";
	}
}
