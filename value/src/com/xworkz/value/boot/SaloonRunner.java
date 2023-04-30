package com.xworkz.value.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.value.configuration.SaloonConfiguration;
import com.xworkz.value.things.Barber;
import com.xworkz.value.things.Chair;
import com.xworkz.value.things.HairDryer;
import com.xworkz.value.things.Mirror;
import com.xworkz.value.things.Saloon;
import com.xworkz.value.things.Scissor;
import com.xworkz.value.things.ShavingCream;
import com.xworkz.value.things.Trimmer;

public class SaloonRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SaloonConfiguration.class);

		System.out.println("--------------Saloon--------------------");
		Saloon saloon = context.getBean(Saloon.class);
		System.out.println(saloon);

		System.out.println("--------------Scissor-------------------");
		Scissor scissor = context.getBean(Scissor.class);
		System.out.println(scissor);

		System.out.println("---------------Chair--------------------");
		Chair chair = context.getBean(Chair.class);
		System.out.println(chair);

		System.out.println("---------------ShavingCream--------------");
		ShavingCream cream = context.getBean(ShavingCream.class);
		System.out.println(cream);

		System.out.println("----------------Mirror-------------------");
		Mirror mirror = context.getBean(Mirror.class);
		System.out.println(mirror);

		System.out.println("---------------HairDryer----------------");
		HairDryer dryer = context.getBean(HairDryer.class);
		System.out.println(dryer);

		System.out.println("---------------Trimmer------------------");
		Trimmer trimmer = context.getBean(Trimmer.class);
		System.out.println(trimmer);

		System.out.println("---------------Barber-------------------");
		Barber barber = context.getBean(Barber.class);
		System.out.println(barber);

		System.out.println("----------------------------------------------");

		System.out.println(context.getBeanDefinitionCount());

		String[] name = context.getBeanDefinitionNames();
		for (int i = 0; i < name.length; i++) {
			String string = name[i];
			System.out.println(string);
		}

	}
}
