package com.example.jpa_demo_todai.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessController {

	
	@GetMapping("/")
	public String firstPage(Model model) {
		return "main";
	}
}
