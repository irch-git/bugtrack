package com.bugtrack.proj1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bugtrack.proj1.entities.Member;

@Controller
@RequestMapping("/members")
public class MemberController {
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String displayMember(Model model) {
		
		Member aMember = new Member();
		
		model.addAttribute("member", aMember);
		
		return "/member/new-member";
	}
}
