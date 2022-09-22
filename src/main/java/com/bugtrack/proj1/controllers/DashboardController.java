package com.bugtrack.proj1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bugtrack.proj1.dao.IMemberRepository;

@Controller
public class DashboardController {
	
	@Autowired
	IMemberRepository memRepo;
	
	@GetMapping("/")
	public String displayDashboard(Model model) {
		
		List<Member> findAll();
		return "main/dashboard";
	}
}
