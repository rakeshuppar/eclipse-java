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
public class SockDTO implements Serializable, Comparable<SockDTO> {

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50, message = "Value should in between 2 and 50")
	private String name;
	@Min(value = 1, message = "value should be greater than 1")
	@Max(value = 100, message = "value should be lesser than 100")
	private int cost;

	@Override
	public int compareTo(SockDTO o) {
		System.out.println("Running compareTo method in SalesManagerDTO");
		return Integer.compare(this.getCost(), o.getCost());
	}
}
