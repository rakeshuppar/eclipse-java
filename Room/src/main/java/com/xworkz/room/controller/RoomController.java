package com.xworkz.room.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class RoomController {
	
	public RoomController() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/info")
	public String onClick() {
	System.out.println("Running onclick method in RoomController");
	return "display.jsp";
	}
	
	

}
