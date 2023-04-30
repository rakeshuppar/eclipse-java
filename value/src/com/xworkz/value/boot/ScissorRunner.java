package com.xworkz.value.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.value.configuration.ScissorConfiguration;
import com.xworkz.value.things.Scissor;

public class ScissorRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ScissorConfiguration.class);
		Scissor scissor = context.getBean(Scissor.class);
		System.out.println(scissor);
		
		System.out.println(context.getBeanDefinitionCount());

		String[] name = context.getBeanDefinitionNames();
		for (int i = 0; i < name.length; i++) {
			String string = name[i];
			System.out.println(string);

		}

	}
}