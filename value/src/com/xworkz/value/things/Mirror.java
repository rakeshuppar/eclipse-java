package com.xworkz.value.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mirror {

	private double height;
	@Value(value = "Rectangle")
	private String shape;
	@Value(value = "100.0F")
	private double weight;

	public Mirror(@Value(value = "5.0") double height) {
		this.height = height;

	}

	@Override
	public String toString() {
		return "Mirror [height=" + height + ", shape=" + shape + ", weight=" + weight + "]";
	}

}
