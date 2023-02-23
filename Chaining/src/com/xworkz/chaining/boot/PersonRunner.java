package com.xworkz.chaining.boot;

import com.xworkz.chaining.things.Doctor;
import com.xworkz.chaining.things.Engineer;

public class PersonRunner {

	public static void main(String[] args) {

		Engineer engineer1 = new Engineer(2, "belli", 45, "belli@gmail.com");
		System.out.println(engineer1.toString());
		System.out.println(engineer1.equals(engineer1));
		System.out.println("hashcode of engineer1 is:" + engineer1.hashCode() + " original Hascode of engineer1 is:"
				+ System.identityHashCode(engineer1));
		System.out.println("----------------------------------------------------------------------------------");

		Engineer engineer2 = new Engineer(3, "basu", 44);
		System.out.println(engineer2.toString());
		System.out.println(engineer2.equals(engineer1));
		System.out.println("hashcode of engineer2 is:" + engineer2.hashCode() + " original Hashcode of engineer2 is:"
				+ System.identityHashCode(engineer2));
		System.out.println("-----------------------------------------------------------------------------------");

		Engineer engineer3 = new Engineer(4, "bond");
		System.out.println(engineer3.toString());
		System.out.println(engineer3.equals(engineer1));
		System.out.println("hashcode of engineer3 is:" + engineer1.hashCode() + " original Hashcode of engineer3 is:"
				+ System.identityHashCode(engineer3));
		System.out.println("------------------------------------------------------------------------------------");

		Doctor doctor1 = new Doctor("dermatolgy");
		System.out.println(doctor1.toString());
		System.out.println(doctor1.equals(doctor1));
		System.out.println("hashcode of doctor1 is:" + doctor1.hashCode() + " original Hashcode of doctor1:"
				+ System.identityHashCode(doctor1));
		System.out.println("------------------------------------------------------------------------------------");

		Doctor doctor2 = new Doctor("cardiology", "kerudi");
		System.out.println(doctor2.toString());
		System.out.println(doctor2.equals(doctor1));
		System.out.println("hashcode of doctor2 is:" + doctor2.hashCode() + " original Hashcode of doctor2:"
				+ System.identityHashCode(doctor2));
		System.out.println("------------------------------------------------------------------------------------");

		Doctor doctor3 = new Doctor(4, "basu", 25, "basu@gmail.com");
		System.out.println(doctor3.toString());
		System.out.println(doctor3.equals(doctor1));
		System.out.println("hashcode of doctor3 is:" + doctor3.hashCode() + " original Hashcode of doctor3 is:"
				+ System.identityHashCode(doctor3));

	}

}
