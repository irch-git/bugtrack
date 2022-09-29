package com.bugtrack.proj1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bugtrack.proj1.dao.IProjectRepository;
import com.bugtrack.proj1.entities.ProjectEntity;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired
	IProjectRepository projRepo;
	
	@GetMapping("/new")
	public String projectForm(Model model) {
		
		ProjectEntity projectFormController = new ProjectEntity();
		model.addAttribute("projectFormHtml", projectFormController);
		
		return "project/new-project";
	}
	
	@PostMapping("/saved")
	public projectSaved(Model model, ProjectEntity projectFormController) {
		
		projRepo.save(projectFormController);
		
		return "redirect:/projects/new";
	}
	
}
