package com.xworkz.autowire.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowire")
public class MuseumConfiguration {

	@Bean
	public String type() {
		System.out.println("Running type in MuseumConfiguration");
		return "Sculptures";
	}

	@Bean
	public String name() {
		System.out.println("Running name in MuseumConfiguration");
		return "Krishna";
	}

	@Bean
	public int age() {
		System.out.println("Running age in MuseumConfiguration");
		return 45;
	}

	@Bean
	public String brand() {
		System.out.println("Running brand in MuseumConfiguration");
		return "Nikon";
	}

	@Bean
	public int numDoor() {
		System.out.println("Running numDoor in MuseumConfiguration");
		return 50;

	}

	@Bean
	public int fee() {
		System.out.println("Running fee in MuseumConfiguration");
		return 100;

	}

	@Bean
	public String names() {
		System.out.println("Running names in MuseumConfiguration");
		return "Sir M Visveswarayya";

	}
}
