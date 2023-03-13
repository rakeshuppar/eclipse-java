package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class TravelDTO implements Serializable {

	private LocalDate date;
	private String travelMode;
	private int travelBudget;
	private double numDays;
	private String traveller;

	public TravelDTO() {
		System.out.println("Running no arg constructor in TravelDTO");
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getTravelMode() {
		return travelMode;
	}

	public void setTravelMode(String travelMode) {
		this.travelMode = travelMode;
	}

	public int getTravelBudget() {
		return travelBudget;
	}

	public void setTravelBudget(int travelBudget) {
		this.travelBudget = travelBudget;
	}

	public double getNumDays() {
		return numDays;
	}

	public void setNumDays(double numDays) {
		this.numDays = numDays;
	}

	public String getTraveller() {
		return traveller;
	}

	public void setTraveller(String traveller) {
		this.traveller = traveller;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, numDays, travelBudget, travelMode, traveller);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelDTO other = (TravelDTO) obj;
		return Objects.equals(date, other.date)
				&& Double.doubleToLongBits(numDays) == Double.doubleToLongBits(other.numDays)
				&& travelBudget == other.travelBudget && Objects.equals(travelMode, other.travelMode)
				&& Objects.equals(traveller, other.traveller);
	}

	@Override
	public String toString() {
		return "Travel [date=" + date + ", travelMode=" + travelMode + ", travelBudget=" + travelBudget + ", numDays="
				+ numDays + ", traveller=" + traveller + "]";
	}

}
