package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
@Setter
@Component
public class Zoo {

	private String name;

	@Value(value = "Bangalore")
	private String location;

	public Zoo(@Value("MysoreZoo") String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Zoo [name=" + name + ", location=" + location + "]";
	}

}
