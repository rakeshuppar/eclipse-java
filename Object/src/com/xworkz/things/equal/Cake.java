package com.xworkz.things.equal;

public class Cake {

	private String flavour;
	private double weight;
	private String shape;
	private String location;

	public Cake() {
		System.out.println("calling cake with no arg constrctor");
	}

	public Cake(String flavour, double weight, String shape, String location) {
		this.flavour = flavour;
		this.weight = weight;
		this.shape = shape;
		this.location = location;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in cake:" + obj);

		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Cake) {
				System.out.println("obj is Cake");

				Cake casted = (Cake) obj;
				Cake left = this;
				Cake right = casted;

				if (left.flavour.equals(flavour) && (left.weight == right.weight)
						&& (left.shape.equals(shape) && (left.location.equals(location)))) {
					System.out.println("left is equal to right");
					return true;

				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("obj is not a cake");
			}
		} else {
			System.err.println("obj is null");
		}

		return false;
	}

	@Override
	public String toString() {
		System.out.println("running tostring in Cake");
		return "flavour:" + this.flavour + " weight:" + this.weight + " shape:" + this.shape + " location:"
				+ this.shape;
	}

}
