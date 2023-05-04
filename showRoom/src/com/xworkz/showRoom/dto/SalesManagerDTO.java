package com.xworkz.showRoom.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesManagerDTO implements Serializable, Comparable<SalesManagerDTO> {

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50, message = "Value should in between 2 and 50")
	private String name;
	@Min(value = 25, message = "value should be greater than 1")
	@Max(value = 100, message = "value should be lesser than 100")
	private int age;

	@Override
	public int compareTo(SalesManagerDTO o) {
		System.out.println("Running compareTo method in SalesManagerDTO");
		return Integer.compare(this.getAge(), o.getAge());
	}

}