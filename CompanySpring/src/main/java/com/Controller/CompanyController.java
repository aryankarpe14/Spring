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

import com.Model.Company;
import com.Service.CompanyServiceImpl;

@RestController
public class CompanyController {

	
	@Autowired
	CompanyServiceImpl comser;
	
	@PostMapping("/addCompany")
	public Company addCompany(@RequestBody Company company) {
		return comser.addCompany(company);
	}
	
	@GetMapping("/getCompany")
	public List<Company> getCompany(){
		return comser.getCompany();
	}

	@GetMapping("/getCompany/{id}")
	public Company getCompany(@PathVariable int id) {
		return comser.getCompany(id);
	}
	
	
	@PutMapping("/updateCompany/{id}")
	public Company updateCompany(@RequestBody Company company,@PathVariable int id) {
		return comser.updateCompany(company, id);
	}
	
	@DeleteMapping("/deleteCompany/{id}")
	public String deleteCompany(@PathVariable int id) {
		return comser.deleteCompany(id);
	}
	
}
