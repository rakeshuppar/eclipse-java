package com.xworkz.autowire.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowire.configuration.MuseumConfiguration;
import com.xworkz.autowire.things.Museum;

public class MuseumRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MuseumConfiguration.class);

		Museum museum = context.getBean(Museum.class);
		System.out.println(museum);
	}

}
