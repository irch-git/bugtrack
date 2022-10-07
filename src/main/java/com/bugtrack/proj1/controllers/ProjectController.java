package com.bugtrack.proj1.controllers;

import java.util.List;

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
	public String projectSaved(Model model, ProjectEntity projectFormHtml) {
		
		projRepo.save(projectFormHtml);
		
		return "redirect:/projects";
	}
	
	@GetMapping
	public String projectData(Model model) {
		
		List<ProjectEntity> projectDataController = projRepo.findAll();
		model.addAttribute("projectDataHtml", projectDataController);
		
		return "project/list-projects";
	}
}
