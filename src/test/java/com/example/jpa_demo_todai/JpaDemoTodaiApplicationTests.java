package com.example.jpa_demo_todai;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jpa_demo_todai.model.Business;
import com.example.jpa_demo_todai.model.BusinessRepo;

@SpringBootTest
class JpaDemoTodaiApplicationTests {

	
	@Autowired
	BusinessRepo repo;
	
	
	@Test
	public void shouldStoreBusiness() {
		Business b = new Business().setName("business1");
		
		repo.save(b);
		
		System.out.println("\nall businesses: ");
		repo.findAll().stream().forEach(System.out::println);
	}

}
