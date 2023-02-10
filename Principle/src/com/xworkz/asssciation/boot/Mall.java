package com.xworkz.asssciation.boot;

public class Mall {

	public String name;
	public String ambience;
	public int totalFloors;
	public Security security;

	
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
		System.out.println("name:" + this.name);
		System.out.println("ambience:" + this.ambience);
		System.out.println("totalFloors:" + this.totalFloors);

		if (this.security != null) {
			this.security.display();
			System.out.println("");
			security.display();
		} else {
			System.out.println("this.security is null");

		}

	}

}
