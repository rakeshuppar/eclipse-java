package com.xworkz.value.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chair {

	@Value(value = "White")
	private String color;
	@Value(value = "Rectangle")
	private String shape;
	@Value(value = "Plastic")
	private String type;

	@Override
	public String toString() {
		return "Chair [color=" + color + ", shape=" + shape + ", type=" + type + "]";
	}

}
