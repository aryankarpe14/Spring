package com.Service;

import java.util.List;

import com.Model.Business;

public interface BusinessService {

	Business addBusiness(Business business);
	List<Business> getBusiness();
	String deleteBusiness(int id);
	Business updateBusiness(Business business,int id);
}
