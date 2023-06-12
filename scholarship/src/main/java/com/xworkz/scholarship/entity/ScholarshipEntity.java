package com.xworkz.scholarship.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScholarshipEntity {
	
	
	private int id;
	private String studentName;
	private String gender;
	private int age;
	private String category;
	private long mobileNum;
	private String email;
	

}
