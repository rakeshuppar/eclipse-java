package com.xworkz.style.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Shoes {

	@Value(value = "Bata")
	private String brand;

	@Value(value = "7")
	private int size;

	@Value(value = "India")
	private String madeIn;

	@Value(value = "0.5")
	private double height;

	@Value(value = "20.0")
	private double weight;

	@Value(value = "3.0")
	private double length;

	@Value(value = "Black")
	private String color;

	@Value(value = "Running")
	private String type;

	@Value(value = "Leather")
	private String material;

	@Value(value = "500")
	private double cost;

	public String ratings() {
		System.out.println("Running ratings in Shoes");
		return "five";
	}

	@Override
	public String toString() {
		return "Shoes [brand=" + brand + ", size=" + size + ", madeIn=" + madeIn + ", height=" + height + ", weight="
				+ weight + ", length=" + length + ", color=" + color + ", type=" + type + ", material=" + material
				+ ", cost=" + cost + "]";
	}

}
