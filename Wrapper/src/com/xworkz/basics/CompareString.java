package com.xworkz.basics;

public class CompareString {

	public static void main(String[] args) {

		String name = "hello";
		String name2 = "hi";

		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		System.out.println(name.compareTo(name2));
		System.out.println(name.compareToIgnoreCase(name2));

	}

}
