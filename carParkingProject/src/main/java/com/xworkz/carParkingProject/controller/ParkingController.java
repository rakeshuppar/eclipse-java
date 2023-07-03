package com.xworkz.carParkingProject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.carParkingProject.dto.ParkingDTO;
import com.xworkz.carParkingProject.service.ParkingService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/")
@EnableWebMvc
@Controller
public class ParkingController {

	@Autowired
	private ParkingService service;

	@PostMapping("/login")
	public String findByEmail(@RequestParam String email, @RequestParam String password, Model model,
			HttpServletRequest req) {
		System.out.println(email);
		ParkingDTO dto = this.service.signIn(email, password);
		if (dto != null) {
			this.service.signIn(email, password);
			HttpSession session = req.getSession(true);
			session.setAttribute("dtos", dto);
			log.info("successfully");
			model.addAttribute("success", "login Successfully");
			model.addAttribute("name", dto.getCreatedBy());
			model.addAttribute("lastLoginTime", dto.getLastLoginTime());
			return "/info.jsp";

		} else {
			log.info("uncucsessfull not match");
			model.addAttribute("error", "Email and Password not matching, invalid credential");
			return "/login.jsp";
		}
	}
}