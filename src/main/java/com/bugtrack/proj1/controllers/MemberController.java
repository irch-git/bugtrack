package com.bugtrack.proj1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bugtrack.proj1.entities.Member;

@Controller
@RequestMapping("/members")
public class MemberController {

//https://www.thymeleaf.org/doc/articles/springmvcaccessdata.html
//form posts	
	@GetMapping("/new")
	public String displayMember(Model model) {
		
		Member aMember = new Member();
		
		model.addAttribute("member", aMember);
		
		return "member/new-member";
	}
	
	@PostMapping("/saved")
	public String saveMember(Model model, Member member) {
		
		return "saved";
	}
	
}
