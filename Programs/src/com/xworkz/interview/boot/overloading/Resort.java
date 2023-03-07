package com.xworkz.interview.boot.overloading;

public class Resort {

	public String name;
	public String id;
	public String ownerName;
	public long mobileNumber;

	public Resort() {
		System.out.println("calling with no arg constructor");
	}

	public Resort(String name) {
		this.name = name;
		System.out.println("calling resort with String constructor");
	}

	public Resort(String name, String id) {
		this(name);
		this.id = id;
		System.out.println("calling resort with String,String Constructor");

	}

	public Resort(String name, String id, String ownerName) {
		this(name, id);
		this.ownerName = ownerName;
		System.out.println("calling resort with String,String and String Constructor");
	}

	public Resort(String name, String id, String ownerName, long mobileNumber) {
		this(name, id, ownerName);
		this.mobileNumber = mobileNumber;
		System.out.println("calling resort with String,String,String and lang constructor");
	}

	public void initVariables(String name, String id, String ownerName, long mobileNumber) {
		this.name = name;
		this.id = id;
		this.ownerName = ownerName;
		this.mobileNumber = mobileNumber;
	}

	public void display() {
		System.out.println("Display START");
		System.out.println("name:" + this.name);
		System.out.println("id:" + this.id);
		System.out.println("ownerName:" + this.ownerName);
		System.out.println("mobileNumber" + this.mobileNumber);
		System.out.println("Display END");
	}

}
