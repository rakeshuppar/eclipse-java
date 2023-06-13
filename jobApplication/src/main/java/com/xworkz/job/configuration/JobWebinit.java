package com.xworkz.job.configuration;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.job.constant.ApplicationConstant;
import com.xworkz.job.controller.JobController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JobWebinit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public JobWebinit() {
		log.info("Running no argument constructor in JobWebinit");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("Running getRootConfigClasses method in JobWebinit ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("Running getServletConfigClasses method in JobWebinit ");
		return new Class[] { JobConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		log.info("Running getServletMappings method in JobWebinit");
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
