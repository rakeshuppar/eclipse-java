package com.xworkz.monday;

public class Paint {

	private String brand;
	private int cost;
	private double year;
	private char size;

	public Paint() {
		System.out.println("calling Paint with no arg constructor");
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setYear(double year) {
		this.year = year;
	}

	public void setSize(char size) {
		this.size = size;
	}

	@Override
	public String toString() {
		System.out.println("running toString in Paint");
		return "brand:" + this.brand + " cost:" + this.cost + "  year:" + this.year + "  size:" + this.size;
	}

	@Override
	public int hashCode() {
		return 22221;
	}

}
