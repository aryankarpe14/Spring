package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aryan")
public class ByeController {

	@GetMapping("/myself")
	public String myself() {
		return "<h1>I am Aryan</h1>";
	}
	

}

