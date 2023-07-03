package com.xworkz.carParkingProject.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "parking_admin")
@NamedQuery(name = "findByEmail", query = "select park from ParkingEntity as park where park.email=:emm ")

public class ParkingEntity implements Serializable, Comparable<ParkingEntity> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "pasword")
	private String pasword;

	@Column(name = "createdBy")
	private String createdBy;

	@Column(name = "createdDate")
	private String createdDate;

	@Column(name = "updateBy")
	private String updateBy;

	@Column(name = "updateDate")
	private String updateDate;

	@Column(name = "lastLoginTime")
	private LocalDateTime lastLoginTime;

	@Override
	public int compareTo(ParkingEntity o) {
		return this.getName().compareTo(o.getName());
	}

}
