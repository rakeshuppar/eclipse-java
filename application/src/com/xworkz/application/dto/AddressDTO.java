package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class AddressDTO implements Serializable  {

	private String street;
	private String area;
	private int pincode;
	private int floor;
	private int number;
	private String city;
	private String state;

	public AddressDTO() {
		System.out.println("running no arg constructor in addressDTO");
	}

	public AddressDTO(String street, String area, int pincode, int floor, int number, String city, String state) {
		super();
		this.street = street;
		this.area = area;
		this.pincode = pincode;
		this.floor = floor;
		this.number = number;
		this.city = city;
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressDTO [street=" + street + ", area=" + area + ", pincode=" + pincode + ", floor=" + floor
				+ ", number=" + number + ", city=" + city + ", state=" + state + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, city, floor, number, pincode, state, street);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressDTO other = (AddressDTO) obj;
		return Objects.equals(area, other.area) && Objects.equals(city, other.city) && floor == other.floor
				&& number == other.number && pincode == other.pincode && Objects.equals(state, other.state)
				&& Objects.equals(street, other.street);
	}

	


}
