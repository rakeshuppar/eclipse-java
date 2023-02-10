package com.xworkz.asssciation.boot;

public class City {

	public String name;
	public String district;
	public String capital;
	public Area area;

	
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
		System.out.println("name:" + this.name);
		System.out.println("disrict:" + this.district);
		System.out.println("capital:" + this.capital);

		if (this.area != null) {
			this.area.display();
			System.out.println("");
			area.display();
		} else {
			System.out.println("this.city is null");
		}
	}

}
