package com.spring;

import java.util.Map;

public class Car 
{
	private int id;
	private double cost;
	private Map<String,String>brandColor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Map<String, String> getBrandColor() {
		return brandColor;
	}
	public void setBrandColor(Map<String, String> brandColor) {
		this.brandColor = brandColor;
	}	
	
}

