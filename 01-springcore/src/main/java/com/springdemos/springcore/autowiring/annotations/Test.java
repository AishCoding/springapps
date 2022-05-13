package com.springdemos.springcore.autowiring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springcore/autowiring/annotations/config.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
	}
}
