package com.xworkz.style.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Door {
	@Value(value = "Wood")
	private String material;

	@Value(value = "Red")
	private String color;

	@Value(value = "2")
	private int numplanks;

	@Value(value = "2.70")
	private double height;

	@Value(value = "1.30")
	private double weight;

	@Value(value = "3.0")
	private double length;

	@Value(value = "0.51")
	private double thickness;

	@Value(value = "10000")
	private double cost;

	@Value(value = "glazed")
	private String type;

	@Value(value = "India")
	private String madeIn;

	public String feedback() {
		System.out.println("Running feedback in Door");
		return "good";
	}

	@Override
	public String toString() {
		return "Door [material=" + material + ", color=" + color + ", numplanks=" + numplanks + ", height=" + height
				+ ", weight=" + weight + ", length=" + length + ", thickness=" + thickness + ", cost=" + cost
				+ ", type=" + type + ", madeIn=" + madeIn + "]";
	}

}
