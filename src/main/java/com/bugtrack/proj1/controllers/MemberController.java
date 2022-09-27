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
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	IMemberRepository memRepo;
	
	@GetMapping("/new")
	public String memberForm(Model model) {
		
		MemberEntity memberFormController = new MemberEntity();
		model.addAttribute("memberFormHtml", memberFormController);
		
		return "member/new-member";
	}
	
	@PostMapping("/saved")
	public String memberSaved(Model model, MemberEntity memberFormController) {
		
		memRepo.save(memberFormController);
		
		return "redirect:/member";
	}
	
	@GetMapping
	public String memberData(Model model) {
		
		List<MemberEntity> memberDataController = memRepo.findAll();
		model.addAttribute("memberDataHtml", memberDataController);
		
		return "member/list-members";
	}
	
}
