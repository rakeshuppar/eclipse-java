package com.xworkz.asssciation.boot;

public class City {

	public String name;
	public String district;
	public String capital;
	public Area area;

	public City() {
		System.out.println("calling with no arg constructor");
	}

	public City(String name, String district, String capital, Area area) {
		this.name = name;
		this.district = district;
		this.capital = capital;
		this.area = area;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public void display() {
		System.out.println("Details of City");
		System.out.println("Cityname:" + this.name);
		System.out.println("district:" + this.district);
		System.out.println("capital:" + this.capital);

		if (this.area != null) {
			this.area.display();
			System.out.println("");

		} else {
			System.out.println("this.city is null");
		}
	}

}
