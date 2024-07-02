package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Business;
import com.Service.BusinessServiceImpl;


@RestController
public class BusinessController {

	
	@Autowired
	BusinessServiceImpl busser;
	
	@PostMapping("/addBusiness")
	public Business addBusiness(@RequestBody Business business) {
		return busser.addBusiness(business);
	}
	
	@GetMapping("/getBusiness")
	public List<Business> getBusiness(){
		return busser.getBusiness();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletebusiness(@PathVariable int id) {
		return busser.deleteBusiness(id);
	}
	
	@PutMapping("/update/{id}")
	public Business updatebusiness(@RequestBody Business business,@PathVariable int id) {
		return busser.updateBusiness(business, id);
	}
	
}
