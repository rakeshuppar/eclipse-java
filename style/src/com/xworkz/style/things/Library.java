package com.xworkz.style.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Library {

	@Value(value = "Central")
	private String name;

	@Value(value = "Malleshwaram")
	private String location;

	@Value(value = "Govt")
	private String under;

	@Value(value = "2")
	private int numFloors;

	@Value(value = "1")
	private int numWashRoom;

	@Value(value = "7.00")
	private double open;

	@Value(value = "9.00")
	private double close;

	@Value(value = "50000")
	private int numBooks;

	@Value(value = "2")
	private int numDoors;

	@Value(value = "Basu")
	private String librarian;

	public String owner() {
		System.out.println("Running owner in Library");
		return "Government";
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", location=" + location + ", under=" + under + ", numFloors=" + numFloors
				+ ", numWashRoom=" + numWashRoom + ", open=" + open + ", close=" + close + ", numBooks=" + numBooks
				+ ", numDoors=" + numDoors + ", librarian=" + librarian + "]";
	}
}
