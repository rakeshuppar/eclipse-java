package com.xworkz.vehicle.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan("com.xworkz.vehicle")
public class SpringConfiguration implements WebMvcConfigurer {

	public SpringConfiguration() {
		System.out.println("no arg constructor in spring configuration");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("Details.jsp");
	}

	/*
	 * @Bean public ViewResolver viewResolver() { InternalResourceViewResolver
	 * ViewResolver = new InternalResourceViewResolver();
	 * ViewResolver.setPrefix("/");ViewResolver.setSuffix(".jsp"); return
	 * ViewResolver;}
	 */

}
