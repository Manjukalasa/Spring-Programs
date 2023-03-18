package com.spring;

import java.util.List;

public class Country
{
	private int id;
	private String name;
	private String pm;
	private String population;
	private List<String> states;
	
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
	public String getPm() {
		return pm;
	}
	public void setPm(String pm) {
		this.pm = pm;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public List<String> getStates() {
		return states;
	}
	public void setStates(List<String> states) {
		this.states = states;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", pm=" + pm + ", population=" + population + ", states="
				+ states + "]";
	}
	
}
