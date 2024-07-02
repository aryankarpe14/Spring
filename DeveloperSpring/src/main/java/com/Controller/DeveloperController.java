package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Developer;
import com.Service.DeveloperServiceImpl;

@RestController
public class DeveloperController {

	@Autowired
	DeveloperServiceImpl devser;
	
	@PostMapping("/addDev")
	public Developer addDeveloper(@RequestBody Developer developer) {
		return devser.addDeveloper(developer);
	}
	
	@GetMapping("/getList")
	public List<Developer> getList(){
		return devser.getDeveloper();
	}
	
	@PutMapping("/update/{id}")
	public Developer updatedev(@RequestBody Developer developer,@PathVariable int id) {
		return devser.updateDeveloper(developer, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDev(@PathVariable int id){
		return devser.deleteDeveloper(id);
	}
	
}
