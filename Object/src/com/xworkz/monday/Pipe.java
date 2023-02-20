package com.xworkz.monday;

public class Pipe {

	private String brand;
	private double diameter;
	private double length;
	private double cost;

	public Pipe() {
		System.out.println("calling pipe with no arg constructor");
	}

	public void setBrand(String brand) {
		this.brand = brand;

	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		System.out.println("running toString in pipe");
		return " brand :" + this.brand + " diameter:" + this.diameter + " length:" + this.length + " cost:" + this.cost;
	}

	@Override
	public int hashCode() {
		return 55555;

	}

}
