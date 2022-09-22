package com.bugtrack.proj1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	
	
	
	@GetMapping("/")
	public String displayDashboard(Model model) {
		
		
		return "main/dashboard";
	}
}
