package com.xworkz.carParkingProject.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class AdminInfoDTO implements Serializable, Comparable<AdminInfoDTO> {

	private static final long serialVersionUID = 1L;

	private int id;
	private String location;
	private String type;
	private String classfication;
	private int days;
	private int price;
	private String discount;

	@Override
	public int compareTo(AdminInfoDTO o) {
		return this.getLocation().compareTo(o.getLocation());
	}

}
