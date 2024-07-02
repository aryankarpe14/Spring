package com.project.StringHelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return ("Hello World");
	}
	
	@GetMapping("/myself")
	public String name() {
		return "<h1>Hello My Name is Aryan</h1>";
	}
	
	@GetMapping("/bye")
	public String bye() {
		return "<h1>ha ha ha ha ha....</h1>";
	}
}
