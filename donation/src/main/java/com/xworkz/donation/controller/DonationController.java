package com.xworkz.donation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.xworkz.donation.dto.DonationDTO;

@Component
@RequestMapping("/")
@EnableWebMvc
public class DonationController implements WebMvcConfigurer {

	public DonationController() {
		System.out.println("created:" + this.getClass().getSimpleName());
	}

	@RequestMapping("/save")
	public String onDonate(@Valid DonationDTO dto, BindingResult br, Model model) {
		System.out.println("Running onDonate method in DonationController:"+dto);
		if (br.hasErrors()) {
			System.out.println("Data is invalid");
			List<ObjectError> error = br.getAllErrors();
			error.forEach(e->System.out.println(e.getDefaultMessage()));
			model.addAttribute("errors", error);
		} else {
			System.out.println("Data is valid");
			model.addAttribute("successMsg", "blood group of" + dto.getFName()+"saved successfully");			
		}
		return "/Donation.jsp";

	}

}
