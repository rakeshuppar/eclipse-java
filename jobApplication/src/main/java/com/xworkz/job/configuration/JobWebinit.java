package com.xworkz.job.configuration;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.job.constant.ApplicationConstant;

public class JobWebinit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public JobWebinit() {
		System.out.println("Running no argument constructor in JobWebinit");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses method in JobWebinit ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses method in JobWebinit ");
		return new Class[] { JobConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings method in JobWebinit");
		return new String[] { "/" };
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize = ApplicationConstant.MAX_FILE_SIZE;
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(
				ApplicationConstant.TEMP_FILE_LOCATION, maxSize, maxSize * 2, maxSize / 2);
		registration.setMultipartConfig(multipartConfigElement);

	}

}
