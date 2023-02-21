package com.xworkz.boot.equal;

public class Fridge {
	private String brand;
	private String type;
	private int doors;
	private double cost;
	private boolean freezer;
	private int compartments;
	private double temp;
	private String quality;
	private boolean ledLight;
	private String refrigerant;
	private String pump;
	private double watt;

	public Fridge() {
		System.out.println("calling Fridge with no arg constructor");
	}

	public Fridge(String brand, String type, int doors, double cost, boolean freezer, int compartments, double temp,
			String quality, boolean ledLight, String refrigerant, String pump, double watt) {
		this.brand = brand;
		this.type = type;
		this.doors = doors;
		this.cost = cost;
		this.freezer = freezer;
		this.compartments = compartments;
		this.temp = temp;
		this.quality = quality;
		this.ledLight = ledLight;
		this.refrigerant = refrigerant;
		this.pump = pump;
		this.watt = watt;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equal in fridge:" + obj);
		if (obj != null) {
			System.out.println("obj is not a null");
			if (obj instanceof Fridge) {
				System.out.println("obj is Fridge");

				Fridge casted = (Fridge) obj;
				Fridge left = this;
				Fridge right = casted;
				if ((left.brand.equals(brand))
						&& ((left.type.equals(type)) && (left.doors == right.doors) && (left.cost == right.cost)
								&& (left.freezer == right.freezer) && (left.compartments == right.compartments)
								&& (left.temp == right.temp) && (left.quality == right.quality)
								&& (left.ledLight == right.ledLight) && (left.refrigerant == right.refrigerant)
								&& ((left.pump.equals(pump)) && (left.watt == right.watt)))) {
					System.out.println("left is equal to right");
				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("obj is not a Fridge");
			}
		} else {
			System.err.println("obj is null");
		}

		return true;
	}

	@Override
	public String toString() {
		System.out.println("running toString in Fridge");
		return "brand:" + this.brand + " type:" + this.type + " doors:" + this.doors + " cost:" + this.cost
				+ " freezer:" + this.freezer + " compartments:" + this.compartments + " temp:" + this.temp + " quality:"
				+ this.quality + " ledLight:" + this.ledLight + " refrigerant:" + this.refrigerant + " pump:"
				+ this.pump + " watt:" + this.watt;
	}

}
