package com.xworkz.boot.equal;

public class Alcohal {

	private String brand;
	private double percentage;
	private int price;
	private String type;

	public Alcohal() {
		System.out.println("calling Alcohal with no arg constructor");
	}

	public Alcohal(String brand, double percentage, int price, String type) {
		this.brand = brand;
		this.percentage = percentage;
		this.price = price;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equal in alcohal :" + obj);

		if (obj != null) {
			System.out.println("obj is not a null");

			if (obj instanceof Alcohal) {
				System.out.println("obj is Alcohal");

				Alcohal casted = (Alcohal) obj;
				Alcohal left = this;
				Alcohal right = casted;

				if (left.brand.equals(brand) && (left.percentage == right.percentage) && (left.price == right.price)
						&& (left.type.equals(type))) {
					System.out.println("left is equal to right");
				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("obj is not a Alcohal");
			}
		} else {
			System.err.println("obj is null");
		}

		return true;
	}

	@Override
	public String toString() {
		System.out.println("running toString in Alcohal");
		return "brand:" + this.brand + "percentage:" + this.percentage + "price:" + this.price + "type:" + this.type;
	}

}
