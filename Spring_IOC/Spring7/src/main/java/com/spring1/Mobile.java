package com.spring1;
import java.util.Map;
public class Mobile
{
	private int id;
	private String brand;
	private Map<Double,String> CostColor;
	
	private Amazon ama;  // Has-A Relation
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Map<Double, String> getCostColor() {
		return CostColor;
	}
	public void setCostColor(Map<Double, String> costColor) {
		CostColor = costColor;
	}
	public Amazon getAma() {
		return ama;
	}
	public void setAma(Amazon ama) {
		this.ama = ama;
	}
}
