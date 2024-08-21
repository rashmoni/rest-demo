package com.rashmoni.rest_demo;

import io.swagger.v3.core.jackson.ModelResolver;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition()
@SpringBootApplication
public class RestDemoApplication {

	public static void main(String[] args) {
		ModelResolver.enumsAsRef = true;
		SpringApplication.run(RestDemoApplication.class, args);
	}

}
