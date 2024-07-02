package com.Service;

import java.util.List;

import com.Model.Company;

public interface CompanyService {

	Company addCompany(Company company);
	List<Company> getCompany();
	Company getCompany(int id);
	String deleteCompany(int id);
	Company updateCompany(Company company,int id);
}
