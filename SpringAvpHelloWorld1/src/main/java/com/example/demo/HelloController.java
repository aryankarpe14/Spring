package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/start")
	public String start() {
		return "<h1 style='color:blue'>Started</h1>";
	}
	
	@GetMapping("/run")
	public String run() {
		return "<h1 style='color:red'>Running</h1>";
	}
	
	@GetMapping("/end")
	public String end() {
		return "<h1 style='color:green'>Finished</h1>";
	}
}
