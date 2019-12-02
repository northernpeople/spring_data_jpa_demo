package com.example.jpa_demo_todai.web;

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

import com.example.jpa_demo_todai.model.Business;
import com.example.jpa_demo_todai.model.BusinessService;
import com.example.jpa_demo_todai.web.command.BusinessDTO;

@Controller
public class BusinessController {

	@Autowired
	BusinessService service;
	
	@GetMapping("/")
	public String formPage(Model model) {
		model.addAttribute("business", new BusinessDTO());
		return "main";
	}
	
	
	@PostMapping("/form_submit")
	public String formSubmit(Model model, @Valid @ModelAttribute BusinessDTO command, Errors errors) {
		
		if(errors.hasErrors()){	
			System.out.println("has errors \n"+errors);
			return "redirect:/";
		}else {
			System.out.println(
					service.createBusiness(command.getName()).getId());
			model.addAttribute("business", new BusinessDTO());
			return "success";
		}
	}
	
	@GetMapping("/business/{id}")
	public String business (@PathVariable("id") String businessId, Model model) {
		Optional<Business> existing = service.findById(businessId);
		if(existing.isPresent()) {
			model.addAttribute("business", existing.get() );
			return "business_details";
		}else {
			System.out.println("business with this id doesn't exist");
			return "main";
		}
		
	}
}
