package com.xworkz.things.equal;

public class PoliceStation {

	private String place;
	private int rooms;
	private int inspector;
	private int headConstable;
	private int constable;
	private int ladyConstable;
	private boolean performance;
	private int cells;
	private int thiefs;
	private boolean parking;

	public PoliceStation() {
		System.out.println("calling PoliceStation with no arg constructor");
	}

	public PoliceStation(String place, int rooms, int inspector, int headConstable, int constable, int ladyConstable,
			boolean performance, int cells, int thiefs, boolean parking) {
		this.place = place;
		this.rooms = rooms;
		this.inspector = inspector;
		this.headConstable = headConstable;
		this.constable = constable;
		this.ladyConstable = ladyConstable;
		this.performance = performance;
		this.cells = cells;
		this.thiefs = thiefs;
		this.parking = parking;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equal in PoliceStation:" + obj);

		if (obj != null) {
			System.out.println("obj is not a null");

			if (obj instanceof PoliceStation) {
				System.out.println("obj is policeStation");

				PoliceStation casted = (PoliceStation) obj;
				PoliceStation left = this;
				PoliceStation right = casted;

				if (left.place.equals(place) && (left.rooms == right.rooms) && (left.inspector == right.inspector)
						&& (left.headConstable == right.headConstable) && (left.constable == right.constable)
						&& (left.ladyConstable == right.ladyConstable) && (left.performance == right.performance)
						&& (left.cells == right.cells) && (left.thiefs == right.thiefs)
						&& (left.parking == right.parking)) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right");
				}

			} else {
				System.err.println("obj is not a policeStation");
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}

	@Override
	public String toString() {
		System.out.println("running toString in PoliceStation");
		return "place:" + this.place + " rooms:" + this.rooms + " inspector:" + this.inspector + " headConstable:"
				+ this.headConstable + " Constable:" + this.constable + " ladyConstable:" + this.ladyConstable
				+ " performance:" + this.performance + " cells:" + this.cells + " thiefs:" + this.thiefs + " parking:"
				+ this.parking;
	}
}
