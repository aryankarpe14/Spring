package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.DeveloperRepository;
import com.Model.Developer;

@Service
public class DeveloperServiceImpl implements DeveloperService{

	@Autowired
	DeveloperRepository devrep;
	
	@Override
	public Developer addDeveloper(Developer developer) {
		// TODO Auto-generated method stub
		return devrep.save(developer);
	}

	@Override
	public List<Developer> getDeveloper() {
		// TODO Auto-generated method stub
		
		return devrep.findAll();
	}

	@Override
	public String deleteDeveloper(int id) {
		// TODO Auto-generated method stub
		devrep.deleteById(id);
		return id+" Record Deleted";
	}

	@Override
	public Developer updateDeveloper(Developer developer, int id) {
		// TODO Auto-generated method stub
		Developer exDev=devrep.findById(id).orElse(null);
		exDev.setDname(developer.getDname());
		exDev.setExperience(developer.getExperience());
		
		return devrep.save(exDev);
	}

}
