package com.xworkz.carParkingProject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user_table")
@NamedQuery(name = "findByUserEmail", query = "select aa from UserEntity aa where aa.email=:mail")
@Slf4j
public class UserEntity implements Serializable, Comparable<UserEntity> {

	private static final long serialVersionUID = 1L;

	@Id

	@Column(name = "userId")
	private int userId;

	@Column(name = "userName")
	private String userName;

	@Column(name = "email")
	private String email;

	@Column(name = "mobileNum")
	private String mobileNum;

	@Column(name = "createdBy")
	private String createdBy;

	@Column(name = "createdDate")
	private String createdDate;

	@Column(name = "updateBy")
	private String updateBy;

	@Column(name = "updateDate")
	private String updateDate;

	@Override
	public int compareTo(UserEntity o) {
		log.info("Running compareTo method in UserEntity");
		return this.getUserName().compareTo(o.getUserName());
	}
}