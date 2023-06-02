package com.xworkz.laptop.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.laptop")
@Configuration
public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("no arg constructor in SpringConfiguration ");
	}

}
