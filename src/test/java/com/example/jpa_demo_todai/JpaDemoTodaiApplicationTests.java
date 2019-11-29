package com.example.jpa_demo_todai;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jpa_demo_todai.model.Business;
import com.example.jpa_demo_todai.model.BusinessRepo;
import com.example.jpa_demo_todai.model.BusinessService;

@SpringBootTest
class JpaDemoTodaiApplicationTests {

	
	@Autowired
	BusinessRepo repo;
	
	@Autowired
	BusinessService service;


	

}
