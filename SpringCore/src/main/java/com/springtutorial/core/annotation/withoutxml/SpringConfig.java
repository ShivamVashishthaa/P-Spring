package com.springtutorial.core.annotation.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean
	public Student getStudent() {
		return new Student();
	}
	@Bean
	public Address getAddress() {
		return new Address();
	}
}
