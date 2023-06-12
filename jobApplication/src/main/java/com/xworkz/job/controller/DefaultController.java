package com.xworkz.job.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.job.dto.JobDTO;

@Component
@RequestMapping("/")
@EnableWebMvc
public class DefaultController {
	
	public DefaultController() {
		System.out.println("Running no arg constructor in DefaultController");
	}

	@GetMapping("/start")
	public String defaultValue(Model model) {
		System.out.println("Running defaultValue method in DefaultController");
		model.addAttribute("dto", new JobDTO());
		return "job.jsp";
	}

}
