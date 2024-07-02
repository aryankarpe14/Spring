package com.project.StringHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StringHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringHelloWorldApplication.class, args);
		System.out.println("Its working ");
	}

}
