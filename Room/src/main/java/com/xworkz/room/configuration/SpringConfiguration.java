package com.xworkz.room.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.room")
@Configuration
public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("Running no arg construction in SpringConfiguration");
	}
	

}
