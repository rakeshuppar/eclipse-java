package com.xworkz.style.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Zoo {

	@Value(value = "Mysore")
	private String name;

	@Value(value = "MysoreCity")
	private String location;

	@Value(value = "100")
	private int numAnimals;

	@Value(value = "2")
	private int numGates;

	@Value(value = "Mysore")
	private String city;

	@Value(value = "2")
	private int numPools;

	@Value(value = "40.0")
	private double area;

	@Value(value = "100")
	private int entryFee;

	@Value(value = "9.0")
	private double open;

	@Value(value = "9.0")
	private double close;

	@Value(value = "4")
	private int numSecurity;

	@Value(value = "5")
	private int numShops;

	@Value(value = "Basavaraj")
	private String security;

	@Value(value = "15")
	private int numLions;

	@Value(value = "10")
	private int numJirafe;

	public String country() {
		System.out.println("Running country in Zoo");
		return "India";
	}

	@Override
	public String toString() {
		return "Zoo [name=" + name + ", location=" + location + ", numAnimals=" + numAnimals + ", numGates=" + numGates
				+ ", city=" + city + ", numPools=" + numPools + ", area=" + area + ", entryFee=" + entryFee + ", open="
				+ open + ", close=" + close + ", numSecurity=" + numSecurity + ", numShops=" + numShops + "]";
	}

}
