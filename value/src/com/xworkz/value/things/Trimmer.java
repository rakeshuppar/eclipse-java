package com.xworkz.value.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trimmer {

	private String brand;
	@Value(value = "Black")
	private String color;
	@Value(value = "500")
	private int price;
	@Value(value = "12.0")
	private double height;

	public Trimmer(@Value(value = "Philips") String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Trimmer [brand=" + brand + ", color=" + color + ", price=" + price + ", height=" + height + "]";
	}

}
