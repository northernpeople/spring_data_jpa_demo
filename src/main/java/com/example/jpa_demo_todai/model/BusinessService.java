package com.example.jpa_demo_todai.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class BusinessService {
	
	@Autowired
	BusinessRepo businessRepo;

	
	public Business createBusiness(String name) {
		Assert.notNull(name, "name cannot be null");
		Business b = new Business().setName(name);
		
		return businessRepo.save(b);
		
	}
	
	
	

}
