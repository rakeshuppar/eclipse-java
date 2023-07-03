package com.xworkz.carParkingProject.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@Slf4j
public class UserDTO implements Serializable, Comparable<UserDTO> {

	private static final long serialVersionUID = 1L;

	private String userName;
	private String email;
	private String mobileNum;
	private String createdBy;
	private String createdDate;
	private String updateBy;
	private String updateDate;

	@Override
	public int compareTo(UserDTO o) {
		log.info("Running Compare method in UserDTO");
		return this.getUserName().compareTo(o.getUserName());
	}

}
