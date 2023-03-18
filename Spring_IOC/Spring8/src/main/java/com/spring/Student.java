package com.spring;

import java.util.Map;

public class Student 
{
	private int id;
	private String name;
	Map<String,Double> SubMarks;
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
	public Map<String, Double> getSubMarks() {
		return SubMarks;
	}
	public void setSubMarks(Map<String, Double> subMarks) {
		SubMarks = subMarks;
	}
	
}
