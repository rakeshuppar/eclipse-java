package com.xworkz.asssciation.boot;

public class Company {

	public String name;
	public String ceoName;
	public double since;
	public Country country;

	
	public void setName(String name) {
		this.name = name;

	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public void setSince(double since) {
		this.since = since;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void display() {
		System.out.println("name:" + this.name);
		System.out.println("ceoName:" + this.ceoName);
		System.out.println("since:" + this.since);

		if (this.country != null) {
			this.country.display();
			System.out.println("");
			country.display();
		} else {
			System.out.println("this.country is null");
		}
	}

}
