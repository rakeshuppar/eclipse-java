package com.xworkz.value.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Scissor {

	private String type;
	@Value(value = "50.0")
	private double weight;
	@Value(value = "Silver")
	private String color;

	public Scissor(@Value(value = "smooth") String type) {
		this.type = type;

	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Scissor [type=" + type + ", weight=" + weight + ", color=" + color + "]";
	}

}
