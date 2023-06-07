package com.xworkz.scholarship.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.scholarship.dto.ScholarshipDTO;

@RequestMapping("/")
@Component
@EnableWebMvc
public class DefaultController {
	
	public DefaultController() {
		System.out.println("Running no arg constructor in DefaultController");
	}
	
	@RequestMapping("/start")
	public String onstart(Model model) {
		System.out.println("Running onstart method in DefaultController");
		model.addAttribute("dto", new ScholarshipDTO());
		return "scholar.jsp";	
	}
}