package com.xworkz.value.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.value.configuration.TrimmerConfiguraion;
import com.xworkz.value.things.Trimmer;

public class TrimmerRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(TrimmerConfiguraion.class);
		Trimmer trimmer = context.getBean(Trimmer.class);
		System.out.println(trimmer);

		System.out.println(context.getBeanDefinitionCount());

		String[] name = context.getBeanDefinitionNames();
		for (int i = 0; i < name.length; i++) {
			String string = name[i];
			System.out.println(string);
		}
	}
}
