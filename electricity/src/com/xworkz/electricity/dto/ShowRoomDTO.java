package com.xworkz.electricity.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xworkz.electricity.constants.Location;

public class ShowRoomDTO implements Serializable, Comparable<ShowRoomDTO> {

	@Min(value = 1, message = "value should be greater than 1")
	@Max(value = 100, message = "value should be lesser than 100")
	private int id;
	@NotNull
	@NotEmpty
	@Size(min = 2, max = 50, message = "Value should in between 2 and 50")
	private String name;
	@NotNull
	private Location location;
	@Min(value = 1, message = "value should be greater than 1")
	@Max(value = 100, message = "value should be lesser than 100")
	private double number;
	@NotNull
	private LocalDate openDate;
	private boolean closed;

	public ShowRoomDTO(int id, String name, Location location, double number, LocalDate openDate, boolean closed) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.number = number;
		this.openDate = openDate;
		this.closed = closed;
	}

	@Override
	public String toString() {
		return "ShowRoomDTO [id=" + id + ", name=" + name + ", location=" + location + ", number=" + number
				+ ", openDate=" + openDate + ", closed=" + closed + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(closed, id, location, name, number, openDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShowRoomDTO other = (ShowRoomDTO) obj;
		return closed == other.closed && id == other.id && location == other.location
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(number) == Double.doubleToLongBits(other.number)
				&& Objects.equals(openDate, other.openDate);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public LocalDate getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	@Override
	public int compareTo(ShowRoomDTO o) {
		System.out.println("running compare to method in showroom DTO");
		return this.name.compareTo(name);
	}

}
