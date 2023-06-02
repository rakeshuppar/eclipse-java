package com.xworkz.vehicle.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Webinit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public Webinit() {
		System.out.println("No-arg constructor in Webinit");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running method getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running method getServletConfigClasses");
		return new Class[] {SpringConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running method getServletMappings");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
