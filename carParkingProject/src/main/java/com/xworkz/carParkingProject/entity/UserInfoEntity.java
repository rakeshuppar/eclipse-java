package com.xworkz.carParkingProject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user_parking_info")
@Slf4j
public class UserInfoEntity implements Serializable, Comparable<UserInfoEntity> {

	private static final long serialVersionUID = 1L;

	@Id

	@Column(name = "userId")
	private int userId;

	@Column(name = "parkingId")
	private int parkingId;

	@Column(name = "vehicleNumber")
	private String vehicleNumber;

	@Column(name = "location")
	private String location;

	@Column(name = "type")
	private String type;

	@Column(name = "classification")
	private String classification;

	@Column(name = "days")
	private int days;

	@Column(name = "price")
	private int price;

	@Column(name = "discount")
	private String discount;

	@Column(name = "total")
	private int total;

	@Column(name = "createdBy")
	private String createdBy;

	@Column(name = "createdDate")
	private String createdDate;

	@Column(name = "updatedBy")
	private String updatedBy;

	@Column(name = "updatedDate")
	private String updatedDate;

	@Override
	public int compareTo(UserInfoEntity o) {
		log.info("Running compare method in UserInfoEntity");
		return this.getLocation().compareTo(o.getLocation());
	}

}