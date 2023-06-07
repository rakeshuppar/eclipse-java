package com.xworkz.donation.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class DonationDTO implements Serializable, Comparable<DonationDTO> {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "first name not be null")
	@NotEmpty(message = "first name not be empty")
	@Size(min = 3, max = 20, message = "First Name should be between 3 to 20")
	private String fName;
	
	@NotNull(message = "last name not be null")
	@NotEmpty(message = "last name not be empty")
	@Size(min = 3, max = 20, message = "Last Name should be between 3 to 20")
	private String lName;

	@Min(value = 18, message = "Age should be greater then 18")
	@Max(value = 50, message = "Age should be less then 18")
	private int age;
	
	@NotNull(message = "gender name not be null")
	@NotEmpty(message = "gender name not be empty")
	@Size(min = 3, max = 20, message = "gender should be between 3 to 20")
	private String gender;
	
	@NotNull(message = " bloodGroupnot be null")
	@NotEmpty(message = " bloodGroup not be empty")
	private String bloodGroup;

	@NotNull(message = "address not be null")
	@NotEmpty(message = "address not be empty")
	@Size(min = 3, max = 20, message = "address should be between 3 to 20")
	private String address;

	@Override
	public int compareTo(DonationDTO o) {
		return this.getFName().compareTo(o.getFName());
	}

}
