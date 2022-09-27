package com.bugtrack.proj1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bugtrack.proj1.dao.IMemberRepository;
import com.bugtrack.proj1.entities.MemberEntity;

@Controller
@RequestMapping("/")
public class DashboardController {
	
	@Autowired
	IMemberRepository memRepo;
	
	@GetMapping
	public String dashboardDisplay(Model model) {
		
		MemberEntity dashboardFormController = new MemberEntity();
		model.addAttribute("dashboardFormHtml", dashboardFormController);
		
		List<MemberEntity> dashboardDataController = memRepo.findAll();
		model.addAttribute("dashboardDataHtml", dashboardDataController);
		
		return "main/dashboard";
	}
	
	@PostMapping("/saved")
	public String dashboardSaved(Model model, MemberEntity dashboardFormController) {
		
		memRepo.save(dashboardFormController);
		
		return "redirect:/";
	}
	
}
