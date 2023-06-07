package com.xworkz.donation.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DonationWebinit extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	public DonationWebinit() {
		System.out.println("Running no arg constructor in DonationWebinit");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses in DonationWebinit");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses in DonationWebinit");
		return new Class[] {DonationConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings in DonationWebinit");
		return new String[] {"/"};
	}
}