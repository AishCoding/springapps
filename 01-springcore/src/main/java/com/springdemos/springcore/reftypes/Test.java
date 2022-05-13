package com.springdemos.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springcore/reftypes/config.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}
}
