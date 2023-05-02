package com.xworkz.style.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Park {

	@Value(value = "Mariyappana palya")
	private String name;

	@Value(value = "Gayatrinagara")
	private String location;

	@Value(value = "Rajajinagar")
	private String area;

	@Value(value = "Bangalore")
	private String city;

	@Value(value = "2")
	private int numGates;

	@Value(value = "2")
	private int washRoom;

	@Value(value = "100")
	private int numTrees;

	@Value(value = "3.00")
	private double open;

	@Value(value = "9.00")
	private double close;

	@Value(value = "Govt")
	private String owner;

	public String rating() {
		System.out.println("Running Ratings in Park");
		return "four";
	}

	@Override
	public String toString() {
		return "Park [name=" + name + ", location=" + location + ", area=" + area + ", city=" + city + ", numGates="
				+ numGates + ", washRoom=" + washRoom + ", numTrees=" + numTrees + ", open=" + open + ", close=" + close
				+ ", owner=" + owner + "]";
	}

}
