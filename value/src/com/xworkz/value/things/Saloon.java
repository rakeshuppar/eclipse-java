package com.xworkz.value.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Saloon {

	private String name;
	private String ownerName;
	private String type;
	private String location;
	private int noOfBarbers;

	public Saloon(
			@Value(value = "Cutandstyle") String name, @Value(value = "Basu") String ownerName,
			@Value(value = "Mens") String type, @Value(value = "Rajajinagar") String location,
			@Value(value = "2") int noOfBarbers) {
		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.location = location;
		this.noOfBarbers = noOfBarbers;
	}

	@Override
	public String toString() {
		return "Saloon [name=" + name + ", ownerName=" + ownerName + ", type=" + type + ", location=" + location
				+ ", noOfBarbers=" + noOfBarbers + "]";
	}

}
