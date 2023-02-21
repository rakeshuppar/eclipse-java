package com.xworkz.monday;

public class Coconut {

	private String shape;
	private boolean kobbari;
	private String type;
	private String location;

	public Coconut() {
		System.out.println("calling coconut with no arg constructor");
	}

	public String getShape() {
		return "Round";
	}

	public boolean isKobbari() {
		return true;
	}

	public String getType() {
		return "Dry";
	}

	public String getLocation() {
		return "Bazara";
	}

	@Override
	public int hashCode() {
		return 44552;
	}

	@Override
	public String toString() {
		System.out.println("Running toString in Coconut");
		return "shape:" + this.shape + " kobbari:" + this.kobbari + " type:" + this.type + " location:" + this.location;

	}

}
