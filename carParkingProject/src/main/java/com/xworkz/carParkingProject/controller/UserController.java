package com.xworkz.carParkingProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.carParkingProject.dto.UserDTO;
import com.xworkz.carParkingProject.dto.UserInfoDTO;
import com.xworkz.carParkingProject.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/save")
	public String onSave(UserDTO dto, UserInfoDTO dto1, Model model) {
		log.info("Running onSave method in UserController");
		boolean status = this.service.validThanSave(dto, dto1);
		if (status) {
			model.addAttribute("success", "Data save Successfully");
			return "userInfo.jsp";
		} else {
			model.addAttribute("error", "Data not saved");
			return "userInfo.jsp";
		}

	}
}