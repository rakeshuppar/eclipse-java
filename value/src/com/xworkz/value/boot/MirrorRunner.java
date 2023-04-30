package com.xworkz.value.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.value.configuration.MirrorConfiguration;
import com.xworkz.value.things.Mirror;

public class MirrorRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MirrorConfiguration.class);
		Mirror mirror = context.getBean(Mirror.class);
		System.out.println(mirror);

		System.out.println(context.getBeanDefinitionCount());
		
		String[] name = context.getBeanDefinitionNames();
		for (int i = 0; i < name.length; i++) {
			String string = name[i];
			System.out.println(string);

		}

	}

}
