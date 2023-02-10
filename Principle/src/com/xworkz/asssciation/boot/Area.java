package com.xworkz.asssciation.boot;

public class Area {

	public String name;
	public double population;
	public String street;

	
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
		//System.out.println("Display START");
		System.out.println("name:" + this.name);
		System.out.println("population:" + this.population);
		System.out.println("street:" + this.street);
		//System.out.println("Display END");

	}

}
