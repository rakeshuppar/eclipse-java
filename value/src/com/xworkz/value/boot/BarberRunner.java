package com.xworkz.value.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.value.configuration.BarberConfiguration;
import com.xworkz.value.things.Barber;

public class BarberRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BarberConfiguration.class);

		System.out.println("----------Barber--------------");
		Barber barber = context.getBean(Barber.class);
		System.out.println(barber);

		System.out.println(context.getBeanDefinitionCount());

		// String[] name = context.getBeanDefinitionNames();
		// for (int i = 0; i < name.length; i++) {
		// String string = name[i];
		// System.out.println(string);

		// }

		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);

	}
}