package com.xworkz.collect.dto;

import java.io.Serializable;
import java.util.Objects;

public class MlaDTO implements Serializable {

	private String name;
	private int age;
	private String constituency;
	private String party;
	private boolean independent;
	private String gender;

	public MlaDTO(String name, int age, String constituency, String party, boolean independent, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.constituency = constituency;
		this.party = party;
		this.independent = independent;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getConstituency() {
		return constituency;
	}

	public String getParty() {
		return party;
	}

	public boolean isIndependent() {
		return independent;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, constituency, gender, independent, name, party);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MlaDTO other = (MlaDTO) obj;
		return age == other.age && Objects.equals(constituency, other.constituency)
				&& Objects.equals(gender, other.gender) && independent == other.independent
				&& Objects.equals(name, other.name) && Objects.equals(party, other.party);
	}

}
