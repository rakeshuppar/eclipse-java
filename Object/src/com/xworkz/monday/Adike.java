package com.xworkz.monday;

public class Adike {

	private String color;
	private String shape;
	private int cost;
	private boolean dry;

	public Adike() {
		System.out.println("calling adike with no arg constructor");
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setDry(boolean dry) {
		this.dry = dry;

	}

	@Override
	public int hashCode() {
		return 55555;
	}

	@Override
	public String toString() {
		System.out.println("Running toString in Adike ");
		return " color:" + this.color + "  shape:" + this.shape + "  cost:" + this.cost + "  dry:" + this.dry;
	}
}