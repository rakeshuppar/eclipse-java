package com.xworkz.laptop.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class LaptopController {
	
	public LaptopController() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/send")
	public String onClick() {
		System.out.println("Running onclick on LaptopController");
		return "index.jsp";
				
	}

}
