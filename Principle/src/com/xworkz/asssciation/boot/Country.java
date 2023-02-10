package com.xworkz.asssciation.boot;

public class Country {

	public String name;
	public String president;
	public boolean developed;
	public State state;

	
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
		System.out.println("name:" + this.name);
		System.out.println("president:" + this.president);
		System.out.println("development:" + this.developed);

		if (this.state != null) {
			this.state.display();
			System.out.println("");
			state.display();
		} else {
			System.out.println("this.state is null");
		}
	}

}
