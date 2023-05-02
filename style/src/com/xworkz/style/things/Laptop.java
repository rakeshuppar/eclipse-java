package com.xworkz.style.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	@Value(value = "HP")
	private String brand;

	@Value(value = "Windows10")
	private String os;

	@Value(value = "40000.0")
	private double cost;

	@Value(value = "7")
	private int generation;

	@Value(value = "Black")
	private String color;

	@Value(value = "4")
	private double memory;

	@Value(value = "Computer7788")
	private String computerName;

	@Value(value = "15.60")
	private double displaySize;

	@Value(value = "Corei5")
	private String processor;

	@Value(value = "8")
	private int ram;

	public String type() {
		System.out.println("Running type in laptop");
		return "175Degree";
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", os=" + os + ", cost=" + cost + ", generation=" + generation + ", color="
				+ color + ", memory=" + memory + ", computerName=" + computerName + ", displaySize=" + displaySize
				+ ", processor=" + processor + ", ram=" + ram + "]";
	}

}
