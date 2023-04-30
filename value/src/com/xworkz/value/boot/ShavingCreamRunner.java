package com.xworkz.value.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.value.configuration.ShavingCreamConfiguration;
import com.xworkz.value.things.ShavingCream;

public class ShavingCreamRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ShavingCreamConfiguration.class);
		ShavingCream cream = context.getBean(ShavingCream.class);
		System.out.println(cream);

		System.out.println(context.getBeanDefinitionCount());

		String[] name = context.getBeanDefinitionNames();
		for (int i = 0; i < name.length; i++) {
			String string = name[i];
			System.out.println(string);

		}

	}
}