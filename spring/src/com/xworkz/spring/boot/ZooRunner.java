package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.ZooConfiguration;
import com.xworkz.spring.things.Zoo;

public class ZooRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ZooConfiguration.class);

		System.out.println(context.getBeanDefinitionCount());

		Zoo zoo = context.getBean(Zoo.class);
		System.out.println(zoo.);

	}

}
