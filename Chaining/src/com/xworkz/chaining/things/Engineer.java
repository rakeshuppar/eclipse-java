package com.xworkz.chaining.things;

public class Engineer extends Person {
	
	public Engineer() {
		System.out.println("calling Engineer with no arg constructor");
	}

	public Engineer(int id, String name, int age, String email) {
		super(id, name, age, email);
	}

	public Engineer(int id, String name) {
		super(id, name);
	}

	public Engineer(int id, String name, int age) {
		super(id, name, age);
	}

	@Override
	public String toString() {
		System.out.println("running tostring in Engineer");

		return "id:" + this.id + " name:" + this.name + " age:" + this.age + " email:" + this.email;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equal in Engineer");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Person) {
				System.out.println("obj is Engineer");

				Engineer casted = (Engineer) obj;
				Engineer left = this;
				Engineer right = casted;

				if ((left.id == right.id)
						&& (left.name.equals(name) && (left.age == right.age) && ((left.email.equals(email))))) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right ");
				}
			} else {
				System.err.println("obj is not Engineer");
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}

	@Override
	public int hashCode() {
		return 152656;
	}
}
