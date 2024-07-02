package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class ApiController {

	@GetMapping("/myself")
	public String myself() {
		return "<h1>I am Student</h1>";
	}

	@GetMapping("/addition")
	public String addition(@RequestParam int a,@RequestParam int b) {
		return "The Addition of A & B is "+(a+b);
	}
	
	@GetMapping("/substraction")
	public String substraction(@RequestParam int a,@RequestParam int b) {
		return "The Substraction of A & B is "+(a-b);
	}
}
