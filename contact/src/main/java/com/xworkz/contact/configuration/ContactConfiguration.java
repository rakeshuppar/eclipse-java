package com.xworkz.contact.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@ComponentScan("com.xworkz.contact")
@Configuration
public class ContactConfiguration implements WebMvcConfigurer {
	
	public ContactConfiguration() {
		System.out.println("Running no arg constructor in ContactConfiguration");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("welcome.jsp");
	}
}
