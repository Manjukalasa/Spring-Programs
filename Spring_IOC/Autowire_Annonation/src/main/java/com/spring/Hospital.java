package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hospital {
	private int id;
	private String name;
	private String website;

	@Autowired
	private Branch branch;

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
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;	
	}
}
