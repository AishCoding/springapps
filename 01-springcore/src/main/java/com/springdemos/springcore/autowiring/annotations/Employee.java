package com.springdemos.springcore.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	
	@Autowired
	@Qualifier("addressInChennai")
	private Address address;
	
//	public Employee(@Qualifier("addressInMumbai") Address address) {
//		this.address = address;
//	}

	public Address getAddress() {
		return address;
	}
	
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
