package com.xworkz.scholarship.configuration;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ScholarshipWebinit extends AbstractAnnotationConfigDispatcherServletInitializer {

	public ScholarshipWebinit() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses method in ScholarshipWebinit");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses method in ScholarshipWebinit");
		return new Class[] { ScholarshipConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings method in ScholarshipWebinit");
		return new String[] { "/" };
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize=80000000;
		MultipartConfigElement multipartConfigElement=new MultipartConfigElement("D:\\tomcat-files\\temp", maxSize, maxSize*2, maxSize/2);
		registration.setMultipartConfig(multipartConfigElement);
	}
}
