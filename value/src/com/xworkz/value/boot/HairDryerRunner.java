package com.xworkz.value.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.value.configuration.HairDryerConfiguration;
import com.xworkz.value.things.HairDryer;

public class HairDryerRunner {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HairDryerConfiguration.class);
		HairDryer dryer = context.getBean(HairDryer.class);
		System.out.println(dryer);

		System.out.println(context.getBeanDefinitionCount());
		
		String[] name = context.getBeanDefinitionNames();
		for (int i = 0; i < name.length; i++) {
			String string = name[i];
			System.out.println(string);

		}

	}
}
