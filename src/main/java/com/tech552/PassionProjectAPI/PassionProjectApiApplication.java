package com.tech552.PassionProjectAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PassionProjectApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassionProjectApiApplication.class, args);
	}


	/*
	we must create a method that builds (through a RestTemplateBuilder) and returns a RestTemplate and mark it with @Bean Spring annotation.
	 As the documentation points out, this annotation is used to indicate that a method produces a bean to be managed by the Spring container.

	 */

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}






}
