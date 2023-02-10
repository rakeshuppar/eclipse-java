package com.xworkz.asssciation.boot;

public class Company {

	public String name;
	public String ceoName;
	public double since;
	public Country country;

	public Company() {
		System.out.println("calling with no arg constructor");
	}

	public Company(String name, String ceoName, double since, Country country) {
		this.name = name;
		this.ceoName = ceoName;
		this.since = since;
		this.country = country;
	}

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
		System.out.println("details of Company");
		System.out.println("Companyname:" + this.name);
		System.out.println("ceoName of the Company:" + this.ceoName);
		System.out.println("since from:" + this.since);

		if (this.country != null) {
			this.country.display();
			System.out.println("");

		} else {
			System.out.println("this.country is null");
		}
	}

}
