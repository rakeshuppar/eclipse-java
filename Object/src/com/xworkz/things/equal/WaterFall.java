package com.xworkz.things.equal;

public class WaterFall {

	private String name;
	private double height;
	private String location;

	public WaterFall() {
		System.out.println("calling Waterfall with no arg constructor");
	}

	public WaterFall(String name, double height, String location) {
		this.name = name;
		this.height = height;
		this.location = location;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in waterfall :" + obj);

		if (obj != null) {
			System.out.println("obj is not null");

			if (obj instanceof WaterFall) {
				System.out.println("obj is Waterfall");

				WaterFall casted = (WaterFall) obj;
				WaterFall left = this;
				WaterFall right = casted;

				if (left.name.equals(name) && (left.height == right.height) && (left.location.equals(location))) {
					System.out.println("left is  equal to right");
					return true;
				} else {
					System.err.println("left is not equal to left");
				}
			} else {
				System.err.println("obj is not a WaterFall");
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}

	@Override
	public String toString() {
		System.out.println("running tostring in Waterfall");
		return "name:" + this.name + " height:" + this.height + " location:" + this.location;
	}

}
