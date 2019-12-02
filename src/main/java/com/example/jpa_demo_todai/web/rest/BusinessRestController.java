package com.example.jpa_demo_todai.web.rest;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa_demo_todai.model.Business;
import com.example.jpa_demo_todai.model.BusinessService;
import com.example.jpa_demo_todai.web.command.BusinessDTO;

@RestController
public class BusinessRestController {

	@Autowired
	BusinessService service;
		
	@GetMapping("/rest/v1/business/{id}")
	public  Business business (@PathVariable("id") String businessId) {
		Optional<Business> existing = service.findById(businessId);
		return existing.get();
	}
	
	
	@PostMapping("/rest/v1/business")
	public  Business createBusiness ( @RequestBody Business b) {
		return service.createBusiness(b.getName());
	}
}
