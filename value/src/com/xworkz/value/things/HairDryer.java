package com.xworkz.value.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HairDryer {

	private String brand;
	@Value(value = "Ceramic")
	private String type;
	@Value(value = "Black")
	private String color;
	@Value(value = "200")
	private double weight;
	@Value(value = "100")
	private int rpm;

	public HairDryer(@Value(value = "Philips") String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "HairDryer [brand=" + brand + ", type=" + type + ", color=" + color + ", weight=" + weight + ", rpm="
				+ rpm + "]";
	}

}
