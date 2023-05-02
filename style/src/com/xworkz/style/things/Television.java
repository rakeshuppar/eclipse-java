package com.xworkz.style.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Television {

	@Value(value = "BPL")
	private String brand;

	@Value(value = "50000.0")
	private double cost;

	@Value(value = "India")
	private String madeIn;

	@Value(value = "colour")
	private String type;

	@Value(value = "15.0")
	private double screenSize;

	@Value(value = "1.50")
	private double height;

	@Value(value = "2.50")
	private double width;

	@Value(value = "1998")
	private double manufacture;

	@Value(value = "Rectangle")
	private String shape;

	@Value(value = "2")
	private int numGlass;

	public String type() {
		System.out.println("Running type in Tv-");
		return "flat";
	}

	@Override
	public String toString() {
		return "Television [brand=" + brand + ", cost=" + cost + ", madeIn=" + madeIn + ", type=" + type
				+ ", screenSize=" + screenSize + ", height=" + height + ", width=" + width + ", manufacture="
				+ manufacture + ", shape=" + shape + ", numGlass=" + numGlass + "]";
	}

}
