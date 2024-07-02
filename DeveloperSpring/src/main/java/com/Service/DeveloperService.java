package com.Service;

import java.util.List;

import com.Model.Developer;

public interface DeveloperService {

	
	Developer addDeveloper(Developer developer);
	List<Developer> getDeveloper();
	String deleteDeveloper(int id);
	Developer updateDeveloper(Developer developer,int id);
}
