package com.springdemos.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springcore/set/config.xml");
		CarDealer car = (CarDealer) context.getBean("cardealer");
		System.out.println(car);
		System.out.println(car.getModels().getClass());
	}
}
