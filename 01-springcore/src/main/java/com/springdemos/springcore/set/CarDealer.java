package com.springdemos.springcore.set;

import java.util.Set;

public class CarDealer {

	private String name;
	private Set<String> models;
	
	
	@Override
	public String toString() {
		return "CarDealer [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getModels() {
		return models;
	}
	public void setModels(Set<String> models) {
		this.models = models;
	}
	
}
