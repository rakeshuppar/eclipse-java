package com.xworkz.things.equal;

public class FootWare {

	private String brand;
	private double size;
	private String type;

	public FootWare() {
		System.out.println("calling footware with no arg constructor");
	}

	public FootWare(String brand, double size, String type) {
		this.brand = brand;
		this.size = size;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equal in footware:" + obj);

		if (obj != null) {
			System.out.println("obj is not null");

			if (obj instanceof FootWare) {
				System.out.println("obj is fotware");

				FootWare casted = (FootWare) obj;
				FootWare left = this;
				FootWare right = casted;

				if (left.brand.equals(brand) && (left.size == right.size) && (left.type.equals(type))) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right");
				}

			} else {
				System.err.println("obj is not a footware");
			}

		} else {
			System.err.println("obj is null");
		}

		return false;
	}

	@Override
	public String toString() {
		System.out.println("running tostring in footware");
		return "brand:" + this.brand + " size:" + this.size + " type:" + this.type;
	}
}
