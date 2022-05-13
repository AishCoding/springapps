package com.springdemos.springcore.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springcore/autowiring/config.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
	}
}
