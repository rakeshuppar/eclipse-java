package com.xworkz.asssciation.boot;

public class Area {

	public String name;
	public double population;
	public String street;

	public Area() {
		System.out.println("calling with no arg constructor");
	}

	public Area(String name, double population, String street) {
		this.name = name;
		this.population = population;
		this.street = street;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void display() {

		System.out.println("Details of area");
		System.out.println("Areaname:" + this.name);
		System.out.println("population of the area:" + this.population);
		System.out.println("street:" + this.street);

	}

}
