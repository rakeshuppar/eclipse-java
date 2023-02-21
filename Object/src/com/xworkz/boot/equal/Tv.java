package com.xworkz.boot.equal;

public class Tv {

	private String brand;
	private int price;
	private double size;

	public Tv() {
		System.out.println("calling tv with no arg constructor ");
	}

	public Tv(String brand, int price, double size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	public boolean equals(Object obj) {
		System.out.println("running equal in tv:" + obj);

		if (obj != null) {
			System.out.println("obj is not null");

			if (obj instanceof Tv) {
				System.out.println("obj is tv");

				Tv casted = (Tv) obj;
				Tv left = this;
				Tv right = casted;

				if (left.brand.equals(right.brand) && ((left.price == right.price)) && (left.size == (right.size))) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("obj is not tv");
			}
		} else {
			System.err.println("obj is null");
		}
		return true;

	}

	@Override
	public String toString() {
		System.out.println("running tostring in Tv");
		return "brand:" + this.brand + " price:" + this.price + " size:" + this.size;
	}

}
