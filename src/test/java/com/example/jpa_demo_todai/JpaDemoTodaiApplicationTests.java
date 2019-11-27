package com.example.jpa_demo_todai;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jpa_demo_todai.model.Business;
import com.example.jpa_demo_todai.model.BusinessRepo;
import com.example.jpa_demo_todai.model.BusinessService;
import com.example.jpa_demo_todai.model.User;

@SpringBootTest
class JpaDemoTodaiApplicationTests {

	
	@Autowired
	BusinessRepo repo;
	
	@Autowired
	BusinessService service;


	
	@Test
	public void shouldAssingEmployeeToBusiness() {
		Business b = service.createBusiness("Business");
		User u = service.createUser("John");
		
		b = service.assignEmployeeTo(b, u);
		
		Business freshFromDB = repo.findById(b.getId()).get();
		freshFromDB.printUsers();
		
	}

}
