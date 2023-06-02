package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class  CricketController {
	
	public CricketController() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	@RequestMapping(value = "/info")
	public String onClick() {
		System.out.println("Running onclick method on Cricket Configuration");
		return "index.jsp";	
	}

}
