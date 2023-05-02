package com.xworkz.style.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Value(value = "Maruti")
	private String brand;

	@Value(value = "150000")
	private int cost;

	@Value(value = "450.0")
	private double weight;

	@Value(value = "Black")
	private String color;

	@Value(value = "petrol")
	private String fuelType;

	@Value(value = "India")
	private String madeIn;

	@Value(value = "2012")
	private int manufacture;

	@Value(value = "Steel")
	private String madeOf;

	@Value(value = "3.5")
	private double height;

	@Value(value = "3.0")
	private double width;

	@Value(value = "3.0")
	private String type;

	@Value(value = "2")
	private int cylinder;

	@Value(value = "MRF")
	private String tyre;

	@Value(value = "4")
	private int numWheels;

	@Value(value = "4")
	private int stroke;

	public String mirror() {
		System.out.println("Running mirror in Car");
		return "two";
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", cost=" + cost + ", weight=" + weight + ", color=" + color + ", fuelType="
				+ fuelType + ", madeIn=" + madeIn + ", manufacture=" + manufacture + ", madeOf=" + madeOf + ", height="
				+ height + ", width=" + width + ", type=" + type + ", cylinder=" + cylinder + ", tyre=" + tyre
				+ ", numWheels=" + numWheels + ", stroke=" + stroke + "]";
	}

}
