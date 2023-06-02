package com.xworkz.Television.Controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Component
@RequestMapping("/")
public class TelevisionController {
	
	public TelevisionController() {
		System.out.println("Running no arg constructor in TelevisionController");
	}
	@RequestMapping(value="/send", method=RequestMethod.POST)
	public ModelAndView onClick() {
		System.out.println("Running Onclick method on TelevisionController");
		String url="https://www.google.com";
		return new ModelAndView("redirect:"+url);
	}

}
