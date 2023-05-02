package com.xworkz.style.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HumanBeings {

	@Value(value = "Basavaraj")
	private String name;

	@Value(value = "2")
	private int numEyes;

	@Value(value = "2")
	private int numEars;

	@Value(value = "2")
	private int hands;

	@Value(value = "Male")
	private String gender;

	@Value(value = "10")
	private double handFingers;

	@Value(value = "white")
	private String color;

	@Value(value = "infinit")
	private String hairs;

	@Value(value = "1")
	private int nose;

	@Value(value = "2")
	private int legs;

	public String feetfingers() {
		System.out.println("Running feetfingers in human");
		return "ten";
	}

	@Override
	public String toString() {
		return "HumanBeings [name=" + name + ", numEyes=" + numEyes + ", numEars=" + numEars + ", hands=" + hands
				+ ", gender=" + gender + ", handFingers=" + handFingers + ", color=" + color + ", hairs=" + hairs
				+ ", nose=" + nose + ", legs=" + legs + "]";
	}

}
