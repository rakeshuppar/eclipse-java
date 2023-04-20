package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class DairyDTO implements Serializable {

	private String name;
	private String location;
	private double open;
	private double close;
	private String ownerName;

	public DairyDTO() {
		System.out.println("Running no arg constructor in DairyDTO");

	}

	public DairyDTO(String name, String location, double open, double close, String ownerName) {
		super();
		this.name = name;
		this.location = location;
		this.open = open;
		this.close = close;
		this.ownerName = ownerName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(close, location, name, open, ownerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DairyDTO other = (DairyDTO) obj;
		return close == other.close && Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& open == other.open && Objects.equals(ownerName, other.ownerName);
	}

	@Override
	public String toString() {
		return "DairyDTO [name=" + name + ", location=" + location + ", open=" + open + ", close=" + close
				+ ", ownerName=" + ownerName + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getClose() {
		return close;
	}

	public void setClose(int close) {
		this.close = close;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
