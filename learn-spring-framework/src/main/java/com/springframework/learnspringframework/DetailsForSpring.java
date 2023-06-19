package com.springframework.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record person(String name, int age, String address) {
};

@Configuration
public class DetailsForSpring {
	@Bean
	public String name() {
		return "Saurabh";
	}

	@Bean
	public int age() {
		return 23;
	}

	@Bean
	public person person() {
		return new person("pathak", 23, "Bangalore");
	}

}
