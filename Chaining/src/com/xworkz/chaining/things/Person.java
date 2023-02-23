package com.xworkz.chaining.things;

public class Person {

	public int id;
	public String name;
	public int age;
	public String email;

	public Person() {
		System.out.println("calling person with no arg constructor");
	}

	public Person(int id) {
		this.id = id;
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public Person(int id, String name, int age) {
		this(id, name);
		this.age = age;
	}

	public Person(int id, String name, int age, String email) {
		this(id, name, age);
		this.email = email;
	}

}