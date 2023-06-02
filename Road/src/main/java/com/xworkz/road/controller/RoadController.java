package com.xworkz.road.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class RoadController {

	public RoadController() {
		System.out.println(this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/send")
	public String onClick() {
		System.out.println("Running onclick method on Cricket Configuration");
		return "/Landing.jsp";
	}

}
