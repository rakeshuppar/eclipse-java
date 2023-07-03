package com.xworkz.carParkingProject.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Slf4j
public class ParkingDTO implements Serializable, Comparable<ParkingDTO> {

	private static final long serialVersionUID = 1L;
	@NotEmpty
	@NotNull
	@Size(max = 30, min = 2, message = "The name should be in between 2 and 30")
	private String name;
	@NotEmpty
	@NotNull
	@Size(max = 30, min = 2, message = "The name should be in between 2 and 30")
	private String email;
	@NotEmpty
	@NotNull
	@Size(max = 30, min = 2, message = "The name should be in between 2 and 30")
	private String pasword;
	private String createdBy;
	private String createdDate;
	private String updateBy;
	private String updateDate;
	
	private LocalDateTime lastLoginTime;

	@Override
	public int compareTo(ParkingDTO o) {
		log.info("Running compareTo method in ParkingDTO");
		return this.getEmail().compareTo(o.getEmail());
	}

}
