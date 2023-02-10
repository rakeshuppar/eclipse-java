package com.xworkz.asssciation.boot;

public class Country {

	public String name;
	public String president;
	public boolean developed;
	public State state;

	public Country() {
		System.out.println("calling with no arg constructor");
	}

	public Country(String name, String president, boolean developed, State state) {
		this.name = name;
		this.president = president;
		this.developed = developed;
		this.state = state;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public void setDeveloped(boolean developed) {
		this.developed = developed;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void display() {
		System.out.println("details of Country");
		System.out.println("Countryname:" + this.name);
		System.out.println("president of the country:" + this.president);
		System.out.println("developed:" + this.developed);

		if (this.state != null) {
			this.state.display();
			System.out.println("");

		} else {
			System.out.println("this.state is null");
		}
	}

}
