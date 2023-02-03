package com.xworkz.start.Object;

public class Place {

	public String name;
	public int population;
	public String district;
	public String state;
	public String country;

	public Place() {
		super();
		System.out.println("calling witn no-arg constructor");
	}

	public Place(String name) {
		this.name = name;
		System.out.println("calling String constructor");
	}

	public Place(String name, int population) {
		this(name);
		this.population = population;
		System.out.println("calling String and int constructors");

	}

	public Place(String name, int population, String district) {

		this(name, population);
		this.district = district;
		System.out.println("calling String and String constructors");
	}

	public Place(String name, int population, String district, String state) {

		this(name, population, district);
		this.state = state;
		System.out.println("calling int and String constructors");
	}

	public Place(String name, int population, String district, String state, String country) {
		this(name, population, district, state);
		this.country = country;
		System.out.println("calling String,String and String constructors");
	}

	public void iniVariables(String name, int population, String district, String state, String country) {
		System.out.println("initial Variables");
		this.name = name;
		this.population = population;
		this.district = district;
		this.state = state;
		this.country = country;
	}

	public void show() {
		System.out.println("showing details START");
		System.out.println("name:" + this.name);
		System.out.println("population:" + this.population);
		System.out.println("district:" + this.district);
		System.out.println("state:" + this.state);
		System.out.println("country:" + this.country);
		System.out.println("showing details END");

	}

}
