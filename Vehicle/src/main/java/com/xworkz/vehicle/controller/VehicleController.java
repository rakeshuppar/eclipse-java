package com.xworkz.vehicle.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class VehicleController {

	public VehicleController() {
		System.out.println(this.getClass().getSimpleName());
	}

	@RequestMapping("/send")
	public String onClick() {
		System.out.println("Running onclick method on Cricket Configuration");
		return "Details.jsp";
	}

}
