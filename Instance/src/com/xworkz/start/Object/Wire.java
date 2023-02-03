package com.xworkz.start.Object;

public class Wire {

	public String type;
	public float diameter;
	public float thickness;
	public float length;
	public String material;
	public float frequency;
	public int cost;
	public String quality;
	public String colour;
	public String brand;

	public Wire() {
		super();
		System.out.println("Wire calling wire with no-arguement constructor");
	}

	public Wire(String type) {
		this.type = type;
		System.out.println("Wire calling  with String constructor");
	}

	public Wire(String type, float diamter) {
		this.type = type;
		this.diameter = diamter;
		System.out.println("Wire calling with String and float Constructors");
	}

	public Wire(String type, float diameter, float thickness) {
		this(type, diameter);
		this.thickness = thickness;
		System.out.println("Wire calling with String,float and float constructors");
	}

	public Wire(String type, float diameter, float thickness, float length) {
		this(type, diameter, thickness);
		this.length = length;
		System.out.println("Wire calling with String,float,float and float constructors");
	}

	public Wire(String type, float diameter, float thickness, float length, String material) {
		this(type, diameter, thickness, length);
		this.material = material;
		System.out.println("Wire calling with String,float,float,float and String Constructors");
	}

	public Wire(String type, float diameter, float thickness, float length, String material, float frequency) {
		this(type, diameter, thickness, length, material);
		this.frequency = frequency;
		System.out.println("Wire calling with String,float,float,float,String and float Constructors");
	}

	public Wire(String type, float diameter, float thickness, float length, String material, float frequency,
			int cost) {
		this(type, diameter, thickness, length, material, frequency);
		this.cost = cost;
		System.out.println("Wire calling with String,float,float,float,String,float,and int Constructors");
	}

	public Wire(String type, float diameter, float thickness, float length, String material, float frequency, int cost,
			String quality) {
		this(type, diameter, thickness, length, material, frequency, cost);
		this.quality = quality;
		System.out.println("Wire calling with String,float,float,float,String,float,int and String Constructors");
	}

	public Wire(String type, float diameter, float thickness, float length, String material, float frequency, int cost,
			String quality, String colour) {
		this(type, diameter, thickness, length, material, frequency, cost, quality);
		this.colour = colour;
		System.out
				.println("Wire calling with String,float,float,float,String,float,int,String and String Constructors");
	}

	public Wire(String type, float diameter, float thickness, float length, String material, float frequency, int cost,
			String quality, String colour, String brand) {
		this(type, diameter, thickness, length, material, frequency, cost, quality, colour);
		this.brand = brand;
		System.out.println("Wire calling with String,float,float,float,String,float,int,Stringand String Constructors");
	}

	public void initialVariable(String type, float diameter, float thickness, float length, String material,
			float frequency, int cost, String quality, String colour, String brand) {
		this.type = type;
		this.diameter = diameter;
		this.thickness = thickness;
		this.length = length;
		this.material = material;
		this.frequency = frequency;
		this.cost = cost;
		this.quality = quality;
		this.colour = colour;
		this.brand = brand;
	}

	public void display() {

		System.out.println("Display is START");
		System.out.println("type:" + this.type);
		System.out.println("diameter in mm:" + this.diameter);
		System.out.println("thickness in mm:" + this.thickness);
		System.out.println("length in guage:" + this.length);
		System.out.println("material:" + this.material);
		System.out.println("frequency in hz:" + this.frequency);
		System.out.println("cost/m:" + this.cost);
		System.out.println("quality:" + this.quality);
		System.out.println("colour:" + this.colour);
		System.out.println("brand:" + this.brand);
		System.out.println("Display is END");

	}
}
