package com.xworkz.asssciation.boot;

public class State {

	public String name;
	public String cmName;
	public String language;
	public City city;

	public State() {
		System.out.println("calling with no arg constructor");
	}

	public State(String name, String cmName, String language, City city) {
		this.name = name;
		this.cmName = cmName;
		this.language = language;
		this.city = city;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setcmName(String cmName) {
		this.cmName = cmName;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void display() {
		System.out.println("Details of State");
		System.out.println("Statename:" + this.name);
		System.out.println("cmName:" + this.cmName);
		System.out.println("language:" + this.language);

		if (this.city != null) {
			this.city.display();
			System.out.println("");

		} else {
			System.out.println("this.city is null");
		}
	}

}
