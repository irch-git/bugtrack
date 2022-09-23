package com.bugtrack.proj1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bugtrack.proj1.dao.IMemberRepository;
import com.bugtrack.proj1.entities.Member;

@Controller
@RequestMapping("/members")
public class MemberController {

//https://www.thymeleaf.org/doc/articles/springmvcaccessdata.html
//form posts	
	
	@Autowired
	IMemberRepository memberRepo;
	
	@GetMapping("/new")
	public String displayMemberForm(Model model) {
		
		Member aMember = new Member();
		
		model.addAttribute("member", aMember);
		
		return "member/new-member";
	}
	
	@PostMapping("/saved")
	public String saveMemberForm(Model model, Member member) {
		
		memberRepo.save(member);
		
		return "redirect:/members/new";
	}
	
	@GetMapping
	public String displayData(Model model) {
		
		List<Member> memberList = memberRepo.findAll();
		
		model.addAttribute(memberList);
		
		return "member/list-member";
	}
	
}
