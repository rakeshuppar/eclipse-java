package com.xworkz.job.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class JobDTO implements Serializable, Comparable<JobDTO> {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "The name should not be null")
	@NotEmpty(message = "The name should not be null")
	@Size(min = 2, max = 20, message = "The name should be in between 2 and 20")
	private String name;

	@NotNull(message = "The qualification should not be null")
	@NotEmpty(message = "The qualification should not be null")
	@Size(min = 2, max = 20, message = "The qualification should be in between 2 and 20")
	private String qualification;

	@Min(value = 20, message = "The age is should above 20 ")
	@Max(value = 30, message = "The age is should below 30")
	private int age;

	@NotNull(message = "The gender should not be null")
	@NotEmpty(message = "The gender should not be null")
	@Size(min = 2, max = 20, message = "The gender should be in between 2 and 20")
	private String gender;

	private long mobilenum;

	@NotNull(message = "The email should not be null")
	@NotEmpty(message = "The email should not be null")
	@Size(min = 2, max = 20, message = "The email should be in between 2 and 20")
	private String email;

	@NotNull(message = "The address should not be null")
	@NotEmpty(message = "The address should not be null")
	@Size(min = 2, max = 20, message = "The address should be in between 2 and 20")
	private String address;

	private String fileName;

	private String contectType;

	private long fileSize;

	@Override
	public int compareTo(JobDTO o) {
		return this.getName().compareTo(o.getName());
	}

}
