package com.xworkz.adhar.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.adhar.dto.AdharDTO;
import com.xworkz.adhar.utile.EmailUtil;

@Component
@RequestMapping("/")
public class AdharController {

	public AdharController() {
		System.out.println("No arg constructor in AdharController");
	}

	@RequestMapping("/submit")
	public String add(AdharDTO dto, Model model) {
		model.addAttribute("msg", "This form is saved for:"+ dto.getFname()+" "+"successfully");
		System.out.println("Running add method in AdharController:" + dto);
		EmailUtil.sendEmail(dto.getEmail(),dto.getFname(), dto.getLname());
		return "/landing.jsp";
	}
}
