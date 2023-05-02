package com.xworkz.style.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Temple {

	@Value(value = "Basavaraj")
	private String name;

	@Value(value = "Hanuman")
	private String godName;

	@Value(value = "2")
	private int numGates;

	@Value(value = "Rajajainagar")
	private String area;

	@Value(value = "Bangalore")
	private String city;

	@Value(value = "3")
	private int numGods;

	@Value(value = "male")
	private String gender;

	@Value(value = "Dravid")
	private String type;

	@Value(value = "250")
	private double fee;

	@Value(value = "2")
	private int numofArchaka;

	public String adminstrationBy() {
		System.out.println("Running administration in temple");
		return "Govt";
	}

	@Override
	public String toString() {
		return "Temple [name=" + name + ", godName=" + godName + ", numGates=" + numGates + ", area=" + area + ", city="
				+ city + ", numGods=" + numGods + ", gender=" + gender + ", type=" + type + ", fee=" + fee
				+ ", numofArchaka=" + numofArchaka + "]";
	}

}
