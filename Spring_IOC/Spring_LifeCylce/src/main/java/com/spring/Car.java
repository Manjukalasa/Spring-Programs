package com.spring;

public class Car
{
private String brand;
private double cost;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public void init()
{
	System.err.println("data initializing");
}
public void destroy()
{
	System.err.println("data vanished");
}
@Override
public String toString() {
	return "Car [brand=" + brand + ", cost=" + cost + "]";
}
}
