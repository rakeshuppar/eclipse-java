package com.xworkz.start.Object;

public class Bag {

	public String brand;
	public String colour;
	public int numZips;
	public int cost;
	public String type;
	public int carryLoad;

	public Bag()

	{
		super();
		System.out.println("Bag calling with no-arguement constructor");
	}

	public Bag(String brand)

	{
		this.brand = brand;
		System.out.println("Bag calling with String constructor");
	}

	public Bag(String brand, String colour)

	{
		this(brand);
		this.colour = colour;
		System.out.println("Bag calling with String,String constructor");

	}

	public Bag(String brand, String colour, int numZips)

	{
		this(brand, colour);
		this.numZips = numZips;
		System.out.println("Bag calling with String,String and int constructor");
	}

	public Bag(String brand, String colour, int numZips, int cost)

	{
		this(brand, colour, numZips);
		this.cost = cost;
		System.out.println("Bag calling with String,String,int and constructor");
	}

	public Bag(String brand, String colour, int numZips, int cost, String type)

	{
		this(brand, colour, numZips, cost);
		this.type = type;
		System.out.println("Bag calling with String,String,int,int and String constructor");
	}

	public Bag(String brand, String colour, int numZips, int cost, String type, int carryLoad)

	{

		this(brand, colour, numZips, cost, type);
		this.carryLoad = carryLoad;
		System.out.println("Bag calling with String,String,int,int,String and int constructor");
	}

	public void initalVariables(String brand, String colour, int numZips, int cost, String type, int carryLoad)

	{

		System.out.println("initializing the variables");
		this.brand = brand;
		this.colour = colour;
		this.numZips = numZips;
		this.cost = cost;
		this.type = type;
		this.carryLoad = carryLoad;

	}

	public void display()

	{

		System.out.println("Dispaly START");
		System.out.println("brand:" + this.brand);
		System.out.println("colour:" + this.colour);
		System.out.println("numZips:" + this.numZips);
		System.out.println("cost:" + this.cost);
		System.out.println("type:" + this.type);
		System.out.println("carryLoad in kg:" + this.carryLoad);
		System.out.println("Display END");

	}

}