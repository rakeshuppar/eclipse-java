package com.xworkz.style.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Table {

	@Value(value = "Rectangle")
	private String shape;

	@Value(value = "yellow")
	private String color;

	@Value(value = "wood")
	private String material;

	@Value(value = "krishna")
	private String madeby;

	@Value(value = "5000")
	private int cost;

	@Value(value = "2.0")
	private double height;

	@Value(value = "3.0")
	private double width;

	@Value(value = "4.0")
	private double length;

	@Value(value = "4")
	private int numlegs;

	@Value(value = "50.0")
	private double capacity;

	public String weight() {
		System.out.println("Running weight in Table");
		return "10.0kg";
	}

	@Override
	public String toString() {
		return "Table [shape=" + shape + ", color=" + color + ", material=" + material + ", madeby=" + madeby
				+ ", cost=" + cost + ", height=" + height + ", width=" + width + ", length=" + length + ", numlegs="
				+ numlegs + ", capacity=" + capacity + "]";
	}
}
