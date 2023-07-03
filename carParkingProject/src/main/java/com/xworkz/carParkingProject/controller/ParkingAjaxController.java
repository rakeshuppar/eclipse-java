package com.xworkz.carParkingProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.carParkingProject.dto.AdminInfoDTO;
import com.xworkz.carParkingProject.service.AdminInfoService;
import com.xworkz.carParkingProject.service.UserService;
import lombok.extern.slf4j.Slf4j;

@RequestMapping("/")
@RestController
@EnableWebMvc
@Slf4j

public class ParkingAjaxController {

	@Autowired
	private UserService service;

	@Autowired
	private AdminInfoService service1;

	@GetMapping(value = "/validateFields/{location}/{type}/{classification}/{days}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String validateFields(@PathVariable String location, @PathVariable String type,
			@PathVariable String classification, @PathVariable int days, Model model) {
		log.info("Running validateFields method in ParkingAjaxController");
		AdminInfoDTO dto = this.service1.isExist(location, type, classification, days);
		System.out.println(dto);
		if (dto != null) {
			return "Data is already exist";
		}
		return " ";
	}

	@GetMapping(value = "/validateEmail/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String validateEmail(@PathVariable String email) {
		log.info("Running validate email");
		boolean exist = service.isUserExist(email);
		if (exist) {
			return "Email is already registered,please login";
		}
		return " ";

	}

	@GetMapping(value = "/getPriceAndDiscount/{location}/{type}/{classification}/{days}", produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminInfoDTO getPriceAndDiscount(@PathVariable String location, @PathVariable String type,
			@PathVariable String classification, @PathVariable int days, Model model) {
		log.info("Ajax Controller: getPriceAndDiscount()");
		log.info("location:" +location);
		log.info("type:" +type);
		log.info("classification:" +classification);
		log.info("days:" +days);
		log.info("Running getPriceAndDiscount method in ParkingAjaxController");
		AdminInfoDTO dto = this.service1.isExist(location, type, classification, days);
		System.out.println(dto);
		if (dto != null) {
			return dto;
		}
		return null;
	}

}