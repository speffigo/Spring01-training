package com.springframework.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GetDetailsUsingSpring {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(DetailsForSpring.class);
		System.out.println(context.getBean("person"));

	}
}
