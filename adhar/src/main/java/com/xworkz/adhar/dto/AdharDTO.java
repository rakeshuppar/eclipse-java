package com.xworkz.adhar.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class AdharDTO implements Serializable, Comparable<AdharDTO> {

	private String fname;
	private String lname;
	private int age;
	private String adress;
	private long mobileNum;
	private String email;

	@Override
	public int compareTo(AdharDTO o) {
		return this.getFname().compareTo(o.getFname());
	}

	
}