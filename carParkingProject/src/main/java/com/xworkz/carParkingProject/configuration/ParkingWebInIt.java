package com.xworkz.carParkingProject.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ParkingWebInIt extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	public ParkingWebInIt() {
		log.info("Running no arg constructor in ParkingWebInIt");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("Running getRootConfigClasses method in ParkingWebInIt");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("Running getServletConfigClasses method in ParkingWebInIt");
		return new Class[] {ParkingConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		log.info("Running getServletMappings method in ParkingWebInIt");
		return new  String[] {"/"};
	}

}
