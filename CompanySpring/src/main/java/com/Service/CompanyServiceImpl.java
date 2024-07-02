package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.CompanyRepository;
import com.Model.Company;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	CompanyRepository comrepo;
	
	@Override
	public Company addCompany(Company company) {
		// TODO Auto-generated method stub
		return comrepo.save(company);
	}

	@Override
	public List<Company> getCompany() {
		// TODO Auto-generated method stub
		
		return comrepo.findAll();
	}

	@Override
	public Company getCompany(int id) {
		// TODO Auto-generated method stub
		return comrepo.findById(id).orElse(null);
	}

	@Override
	public String deleteCompany(int id) {
		// TODO Auto-generated method stub
		comrepo.deleteById(id);
		return id+" Record Deleted";
	}

	@Override
	public Company updateCompany(Company company, int id) {
		// TODO Auto-generated method stub
		Company exCompany=comrepo.findById(id).orElse(null);
		exCompany.setName(company.getName());
		exCompany.setCategory(company.getCategory());
		exCompany.setComOwner(company.getComOwner());
		exCompany.setEmpcount(company.getEmpcount());
		return comrepo.save(exCompany);
	}

}
