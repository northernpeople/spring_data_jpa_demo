package com.example.jpa_demo_todai.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
			service.createBusiness(command.getName());
			model.addAttribute("business", new BusinessDTO());
			return "success";
		}
	}
}
