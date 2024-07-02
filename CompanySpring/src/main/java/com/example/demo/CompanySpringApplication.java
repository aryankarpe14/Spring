package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.Controller","com.Dao","com.Model","com.Service"})
@EntityScan("com.Model")
@EnableJpaRepositories(basePackages = "com.Dao")
public class CompanySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanySpringApplication.class, args);
	}

}
