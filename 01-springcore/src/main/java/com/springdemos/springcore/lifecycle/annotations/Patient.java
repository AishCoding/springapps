package com.springdemos.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int id;

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside id setter method..");
	}
	
	@PostConstruct
	public void hi()
	{
		System.out.println("Inside method..hi");
	}
	
	@PreDestroy
	public void bye()
	{
		System.out.println("Inside method..bye");
	}
}
