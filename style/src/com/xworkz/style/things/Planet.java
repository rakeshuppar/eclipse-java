package com.xworkz.style.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Planet {

	@Value(value = "earth")
	private String name;

	@Value(value = "7.1555")
	private double inclination;

	@Value(value = "Moon")
	private String satellite;

	@Value(value = "6371.0")
	private double meanRadius;

	@Value(value = "6378.137")
	private double polarRadius;

	@Value(value = "6356.752")
	private double equatorialRadius;

	@Value(value = "40075.017")
	private double circumference;

	@Value(value = "510072000")
	private double surface;

	@Value(value = "5.5134")
	private double meanDensity;

	@Value(value = "287.91")
	private double temperature;

	@Value(value = "Prithvi")
	private String anotherName;

	public String layers() {
		System.out.println("Running layers in Planets");
		return "three";
	}

	@Override
	public String toString() {
		return "Planet [name=" + name + ", inclination=" + inclination + ", satellite=" + satellite + ", meanRadius="
				+ meanRadius + ", polarRadius=" + polarRadius + ", equatorialRadius=" + equatorialRadius
				+ ", circumference=" + circumference + ", surface=" + surface + ", meanDensity=" + meanDensity
				+ ", temperature=" + temperature + ", anotherName=" + anotherName + "]";
	}

}
