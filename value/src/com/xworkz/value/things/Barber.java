package com.xworkz.value.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Barber {

	@Value(value = "Belli")
	private String name;
	@Value(value = "5")
	private int experiance;
	@Value(value = "15000")
	private double salary;
	@Value(value = "26")
	private int age;
	@Value(value = "7895653322")
	private long contactNo;
	@Value(value = "Male")
	private String gender;

	@Override
	public String toString() {
		return "Barber [name=" + name + ", experiance=" + experiance + ", salary=" + salary + ", age=" + age
				+ ", contactNo=" + contactNo + ", gender=" + gender + "]";
	}

}
