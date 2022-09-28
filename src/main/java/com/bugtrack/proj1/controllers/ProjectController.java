package com.bugtrack.proj1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	public String projectForm() {
		
		return "project/new-project";
	}
}
