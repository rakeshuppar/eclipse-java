package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class AttendanceDTO implements Serializable {

	private int numMembers;
	private int present;
	private double absent;
	private LocalDate date;
	private double numColumns;

	public AttendanceDTO() {
		System.out.println("Running no arg constructor in AttendanceDTO");
	}

	public int getNumMembers() {
		return numMembers;
	}

	public void setNumMembers(int numMembers) {
		this.numMembers = numMembers;
	}

	public int getPresent() {
		return present;
	}

	public void setPresent(int present) {
		this.present = present;
	}

	public double getAbsent() {
		return absent;
	}

	public void setAbsent(double absent) {
		this.absent = absent;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getNumColumns() {
		return numColumns;
	}

	public void setNumColumns(double numColumns) {
		this.numColumns = numColumns;
	}

	@Override
	public int hashCode() {
		return Objects.hash(absent, date, numColumns, numMembers, present);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttendanceDTO other = (AttendanceDTO) obj;
		return Double.doubleToLongBits(absent) == Double.doubleToLongBits(other.absent)
				&& Objects.equals(date, other.date)
				&& Double.doubleToLongBits(numColumns) == Double.doubleToLongBits(other.numColumns)
				&& numMembers == other.numMembers && present == other.present;
	}

	@Override
	public String toString() {
		return "AttendanceDTO [numMembers=" + numMembers + ", present=" + present + ", absent=" + absent + ", date="
				+ date + ", numColumns=" + numColumns + "]";
	}
}
