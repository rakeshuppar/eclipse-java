package com.xworkz.boot.equal;

public class Park {

	private String name;
	private int gates;
	private boolean toilet;
	private boolean ground;
	private boolean restRoom;
	private int trees;

	public Park() {
		System.out.println("caaling tree with no arg constructor");
	}

	public Park(String name, int gates, boolean toilet, boolean ground, boolean restRoom, int trees) {
		this.name = name;
		this.gates = gates;
		this.toilet = toilet;
		this.ground = ground;
		this.restRoom = restRoom;
		this.trees = trees;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equal in Park:" + obj);

		if (obj != null) {
			System.out.println("obj is not a null");
			if (obj instanceof Park) {
				System.out.println("obj is Park");

				Park casted = (Park) obj;
				Park left = this;
				Park right = casted;

				if (left.name.equals(name) && (left.gates == right.gates) && (left.toilet == right.toilet)
						&& (left.ground == right.ground) && (left.restRoom == right.restRoom)
						&& (left.trees == right.trees)) {
					System.out.println("left is equal to right");
				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("obj is not a Park");
			}
		} else {
			System.err.println("obj is null");
		}

		return true;
	}

	@Override
	public String toString() {
		System.out.println("running toString in park");
		return "name:" + this.name + " gates:" + this.gates + " toilet:" + this.toilet + " ground:" + this.ground
				+ " restRoom:" + this.restRoom + " trees:" + this.trees;
	}

}
