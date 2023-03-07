package com.xworkz.things.monday;

public class SugarCane {

	private double height;
	private boolean taste;
	private String grown;
	private double diameter;

	public SugarCane() {
		System.out.println("calling Sugarcane with no arg constructor");

	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setTaste(boolean taste) {
		this.taste = taste;
	}

	public void setGrown(String grown) {
		this.grown = grown;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	@Override
	public int hashCode() {
		return 85855;
	}

	@Override
	public String toString() {
		System.out.println("Running toString in SugarCane");
		return "height:" + this.height + "  taste:" + this.taste + "  grown:" + this.grown + "  diameter:"
				+ this.diameter;
	}

}
