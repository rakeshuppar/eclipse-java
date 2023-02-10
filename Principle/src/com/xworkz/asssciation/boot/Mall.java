package com.xworkz.asssciation.boot;

public class Mall {

	public String name;
	public String ambience;
	public int totalFloors;
	public Security security;

	public Mall() {
		System.out.println("calling with no arg constructor");
	}

	public Mall(String name, String ambience, int totalFloors, Security security) {
		this.name = name;
		this.ambience = ambience;
		this.totalFloors = totalFloors;
		this.security = security;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setAmbience(String ambience) {
		this.ambience = ambience;
	}

	public void setTotalfloors(int totalFloors) {
		this.totalFloors = totalFloors;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}

	public void display() {
		System.out.println("Display START");
		System.out.println("deatails of mall");
		System.out.println("Mallname:" + this.name);
		System.out.println("ambience of the Mall:" + this.ambience);
		System.out.println("totalFloors in the Mall:" + this.totalFloors);

		if (this.security != null) {
			this.security.display();

			System.out.println("");

		} else {
			System.out.println("this.security is null");

		}
		System.out.println("Display END");

	}

}
