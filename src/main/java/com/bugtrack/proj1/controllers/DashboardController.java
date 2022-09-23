package com.bugtrack.proj1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bugtrack.proj1.dao.IMemberRepository;
import com.bugtrack.proj1.entities.Member;

@Controller
public class DashboardController {
	
	@Autowired
	IMemberRepository memRepo;
	
	@GetMapping("/")
	public String displayDashboard(Model model) {
		
		List<Member> membersDashboardList = memRepo.findAll();
		
		model.addAttribute("membersDashboard", membersDashboardList);
		
		return "main/dashboard";
	}
}
