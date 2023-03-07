package com.xworkz.basics;

public class Evenoddprime {

	public static void main(String[] args) {

		int number = 3;
		int count = 0;

		if (number % 2 == 0) {
			System.out.println("Given number is even:" + number);
		} else {
			System.out.println("Given number is odd:" + number);
		}

		for (int i = 1; i <= number; i++)
			if (number % i == 0) {
				count++;
			}
		if (count == 2) {
			System.out.println("Given number is prime:" + number);
		} else {
			System.out.println("Given number is not Prime:" + number);
		}

	}
}
