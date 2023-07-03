package com.xworkz.carParkingProject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.carParkingProject.dto.AdminInfoDTO;
import com.xworkz.carParkingProject.service.AdminInfoService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequestMapping("/")
public class AdminInfoController {

	@Autowired
	private AdminInfoService service;

	@PostMapping("/adminInfo")
	public String onSave(AdminInfoDTO dto, Model model) {
		log.info("Running onSave method in AdminInfoController");
		if (dto != null) {
			log.info(" data is correct ");
			boolean status = this.service.validThenSave(dto);
			if (status) {
				model.addAttribute("success", "Information is successfully saved");
				return "/adminInfo.jsp";
			} else {
				model.addAttribute("error", "Data is already exist");
				return "/adminInfo.jsp";
			}
			
		} else {
			model.addAttribute("dtoError", "Please enter the data");
			log.info("dto is null");
		}
		return "/adminInfo.jsp";
	}

	@GetMapping("/search")
	public String onSearch(String location, Model model) {
		log.info("Running onSearch in AdminInfoController:" + location);
		List<AdminInfoDTO> list = this.service.findByLocation(location);
		model.addAttribute("list", list);
		return "/search.jsp";
	}

}
