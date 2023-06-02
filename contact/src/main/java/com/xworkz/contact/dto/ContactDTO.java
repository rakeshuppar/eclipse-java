package com.xworkz.contact.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO implements Serializable, Comparable<ContactDTO> {

	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private String country;
	private String mobileNum;
	private String type;
	private String description;

	@Override
	public int compareTo(ContactDTO o) {
		return this.getName().compareTo(o.getName());
	}

}
