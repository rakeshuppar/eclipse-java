package com.xworkz.monday;

public class Door {

	private String material;
	private String shape;
	private int cost;
	private double thickness;

	public Door() {
		System.out.println("calling door with no arg constuctor");

	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	@Override
	public int hashCode() {
		return 99889;
	}

	@Override
	public String toString() {
		System.out.println("Running toString in Door");
		return "material:" + this.material + " shape:" + this.shape + " cost:" + this.cost + " thickness:"
				+ this.thickness;

	}

}
