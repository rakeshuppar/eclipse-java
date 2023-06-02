package com.xworkz.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {
	
	
	public SpringConfiguration() {
	System.out.println("no arg constructor in spring configuration");
	}

}
