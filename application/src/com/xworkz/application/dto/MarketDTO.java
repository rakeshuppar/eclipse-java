package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class MarketDTO implements Serializable {

	private String market;
	private String location;
	private int areainSqm;
	private double numShops;
	private boolean neat;

	public MarketDTO() {
		System.out.println("Running no arg constructor in MarketDTO");
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAreainSqm() {
		return areainSqm;
	}

	public void setAreainSqm(int areainSqm) {
		this.areainSqm = areainSqm;
	}

	public double getNumShops() {
		return numShops;
	}

	public void setNumShops(double numShops) {
		this.numShops = numShops;
	}

	public boolean isNeat() {
		return neat;
	}

	public void setNeat(boolean neat) {
		this.neat = neat;
	}

	@Override
	public int hashCode() {
		return Objects.hash(areainSqm, location, market, neat, numShops);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketDTO other = (MarketDTO) obj;
		return areainSqm == other.areainSqm && Objects.equals(location, other.location)
				&& Objects.equals(market, other.market) && neat == other.neat
				&& Double.doubleToLongBits(numShops) == Double.doubleToLongBits(other.numShops);
	}

	@Override
	public String toString() {
		return "MarketDTO [market=" + market + ", location=" + location + ", areainSqm=" + areainSqm + ", numShops="
				+ numShops + ", neat=" + neat + "]";
	}

}
