package com.springdemos.springcore.shoppingcart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springcore/shoppingcart/config.xml");
		Cart items = (Cart) context.getBean("cart");
		System.out.println(items);
	}
}
