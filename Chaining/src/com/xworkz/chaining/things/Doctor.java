package com.xworkz.chaining.things;

public class Doctor extends Person {

	public String specialist;
	public String hospialName;

	public Doctor() {
		System.out.println("calling Doctor with no arg constructor");
	}

	public Doctor(int id, String name, int age, String email) {

		super(id, name, age, email);
	}

	public Doctor(String specialist) {
		this.specialist = specialist;
	}

	public Doctor(String specialist, String hospitalName) {
		this(specialist);
		this.hospialName = hospitalName;
	}

	public Doctor(int id, String name, int age, String email, String specialist, String hospialName) {
		this(id, name, age, email);
		this.specialist = specialist;
		this.hospialName = hospialName;

	}

	@Override
	public String toString() {
		System.out.println("running toString in Doctor");

		return "id:" + this.id + " name:" + this.name + " age:" + this.age + " email:" + this.email + " specialist:"
				+ this.specialist + " hospitalName:" + this.hospialName;
	}

	@Override
	public int hashCode() {
		return 556666;
	}

}
