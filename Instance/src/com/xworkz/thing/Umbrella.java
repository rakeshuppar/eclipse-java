package com.xworkz.thing;

public class Umbrella {
	
	public String rib;
	public String pole;
	public String colour;
	public String protect;
	public String largestUmbrella;
	public float diameter;
	public int size;
	public float length;
	public int cost;
	public String madeOf;
	
	
	public Umbrella(String rib,String pole,String colour,String protect,String largestUmbrella,float diameter,int size,float length,int cost,String madeOf) {
		
		this.rib=rib;
		this.pole=pole;
		this.colour=colour;
		this.protect=protect;
		this.largestUmbrella=largestUmbrella;
		this.diameter=diameter;
		this.size=size;
		this.length=length;
		this.cost=cost;
		this.madeOf=madeOf;
	}
	
	
	public void display() {
		
		System.out.println("rib:"+this.rib);
		System.out.println("pole:"+this.pole);
		System.out.println("colour:"+this.colour);
		System.out.println("protect:"+this.protect);
		System.out.println("largestUmbrella:"+this.largestUmbrella);
		System.out.println("diameter in cm:"+this.diameter);
		System.out.println("sizein in ch:"+this.size);
		System.out.println("lengthin in ch:"+this.length);
		System.out.println("cost:"+this.cost);
		System.out.println("made Of:"+this.madeOf);
	}

}
