package com.springdemos.springcore.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/standalone/collections/config.xml");

		// get the hospital bean from the container
		ProductsList product = (ProductsList) context.getBean("products");
		
		// print the bean
		System.out.println(product);
	
		
	}
}
