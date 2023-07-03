package com.xworkz.carParkingProject.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@Slf4j
public class UserInfoDTO implements Serializable, Comparable<UserInfoDTO> {

	private static final long serialVersionUID = 1L;

	private int userId;
	private int parkingId;
	private String vehicleNumber;
	private String location;
	private String type;
	private String classification;
	private int days;
	private int price;
	private String discount;
	private int total;
	private String createdBy;
	private String createdDate;
	private String updatedBy;
	private String updatedDate;

	@Override
	public int compareTo(UserInfoDTO o) {
		log.info("Running compareTo method in UserInfoDTO");
		return this.getLocation().compareTo(o.getLocation());
	}

}
