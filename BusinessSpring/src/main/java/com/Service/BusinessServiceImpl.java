package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.BusinessRepository;
import com.Model.Business;

@Service
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	BusinessRepository busrep;
	
	@Override
	public Business addBusiness(Business business) {
		// TODO Auto-generated method stub
		return busrep.save(business);
	}

	@Override
	public List<Business> getBusiness() {
		// TODO Auto-generated method stub
		return busrep.findAll();
	}

	@Override
	public Business updateBusiness(Business business, int id) {
		// TODO Auto-generated method stub
		Business exBusiness=busrep.findById(id).orElse(null);
		exBusiness.setName(business.getName());
		exBusiness.setCategory(business.getCategory());
		exBusiness.setRevenue(business.getRevenue());
		return busrep.save(exBusiness);
	}

	@Override
	public String deleteBusiness(int id) {
		// TODO Auto-generated method stub
		
		busrep.deleteById(id);
		return id+" Record Deleted";
	}

	
}
