package com.springdemos.springcore.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springcore/lifecycle/config.xml");
		Patient customer = (Patient) context.getBean("patient");
		System.out.println(customer);
		context.registerShutdownHook();

	}
}
