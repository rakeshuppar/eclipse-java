package com.xworkz.thing;

public class Burger {
	
	
	public String type;
	public int cost;
	public boolean taste;
	public boolean spicy;
	public char veg;
	public String course;
	public String hotelName;
	public float fat;
	public String location;
	public float calories;
	public float colestrol;
	public float sodium;
	public float protein;
	public float pottasium;
	public float iron;


public  Burger(String type,int cost,boolean taste,boolean spicy,char veg,String course,String hotelName,float fat,String location,float calories,float colestral,float sodium,float protein,float pottasium,float iron)
{
	
	this.type=type;
	this.cost=cost;
	this.taste=taste;
	this.spicy=spicy;
	this.veg=veg;
	this.course=course;
	this.hotelName=hotelName;
	this.fat=fat;
	this.location=location;
	this.calories=calories;
	this.sodium=sodium;
	this.protein=protein;
	this.pottasium=pottasium;
	this.iron=iron;
	
	
	
}

public void display() {
	
	System.out.println("type:"+this.type);
	System.out.println("cost"+this.cost);
	System.out.println("taste:"+this.taste);
	System.out.println("spicy:"+this.spicy);
	System.out.println("veg:"+this.veg);
	System.out.println("course:"+this.course);
	System.out.println("hotelName:"+this.hotelName);
	System.out.println("fat:"+this.fat);
	System.out.println("location:"+this.location);
	System.out.println("calories:"+this.calories);
	System.out.println("colestrol:"+this.colestrol);
	System.out.println("sodium:"+this.sodium);
	System.out.println("protein:"+this.protein);
	System.out.println("pottasium:"+this.pottasium);
	System.out.println("iron:"+this.iron);
}
	
	
	
}
