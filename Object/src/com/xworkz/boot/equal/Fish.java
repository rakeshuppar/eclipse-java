package com.xworkz.boot.equal;

public class Fish {

	private String type;
	private int price;
	private String richMineral;
	private char size;
	private double length;

	public Fish() {
		System.out.println("calling Fish with no arg constructor");
	}

	public Fish(String type, int price, String richMineral, char size, double length) {
		this.type = type;
		this.price = price;
		this.richMineral = richMineral;
		this.size = size;
		this.length = length;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equal in fish:" + obj);

		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Fish) {
				System.out.println("obj is Fish");

				Fish casted = (Fish) obj;
				Fish left = this;
				Fish right = casted;

				if (left.type.equals(type) && (left.price == right.price) && (left.richMineral.equals(richMineral))
						&& (left.size == right.size) && (left.length == right.length)) {
					System.out.println("left is equal to right");
				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("obj is not fish");
			}
		} else {
			System.err.println("obj is null");
		}

		return true;
	}

	@Override
	public String toString() {
		System.out.println("running toString in Fish");
		return "type:" + this.type + " price:" + this.price + " richMineral:" + this.richMineral + " size:" + this.size
				+ " length:" + this.length;
	}

}
