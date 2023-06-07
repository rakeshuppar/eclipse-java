package com.xworkz.scholarship.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ScholarshipDTO implements Serializable, Comparable<ScholarshipDTO> {

	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "The studentName should not be empty")
	@NotNull(message = "The studentName should not be null")
	@Size(min = 2, max = 30, message = "The studentName should be in between 2 and 30")
	private String studentName;

	@NotEmpty(message = "The gender should not be empty")
	@NotNull(message = "The gender should not be null")
	@Size(min = 2, max = 30, message = "The studentName should be in between 2 and 30")
	private String gender;

	@Min(value = 18, message = "The age should be greater than is 18")
	@Max(value = 25, message = "The age should be greater than is 25")
	private int age;

	@NotEmpty(message = "The category should not be empty")
	@NotNull(message = "The category should not be null")
	@Size(min = 2, max = 30, message = "The studentName should be in between 2 and 30")
	private String category;
	
	@NotEmpty(message = "The religion should not be empty")
	@NotNull(message = "The religion should not be null")
	@Size(min = 2, max = 30, message = "The religion should be in between 2 and 30")
	private String religion;

	private long mobileNum;
	
	@NotEmpty(message = "The email should not be empty")
	@NotNull(message = "The email should not be null")
	@Size(min = 2, max = 30, message = "The email should be in between 2 and 30")
	private String email;

	private long adharNum;

	@NotEmpty(message = "The address should not be empty")
	@NotNull(message = "The address should not be null")
	@Size(min = 2, max = 30, message = "The address should be in between 2 and 30")
	private String address;

	@Override
	public int compareTo(ScholarshipDTO o) {
		return this.getStudentName().compareTo(o.getStudentName());
	}

}
