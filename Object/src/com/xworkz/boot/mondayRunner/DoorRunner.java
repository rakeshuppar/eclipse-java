package com.xworkz.boot.mondayRunner;

import com.xworkz.things.monday.Door;

public class DoorRunner {

	public static void main(String[] args) {

		Door door = new Door();
		door.setMaterial("Wood");
		door.setShape("Rectangle");
		door.setCost(25000);
		door.setThickness(25);
		System.out.println(door);

		Door door1 = new Door();
		door1.setMaterial("Concrete");
		door1.setShape("Circle");
		door1.setCost(15000);
		door1.setThickness(30);
		System.out.println(door1);

		System.out.println("HashCode of door is:" + door.hashCode() + " Original Hashcode of door is:"
				+ System.identityHashCode(door));

		System.out.println(door.equals(door1));

	}

}
