package com.xworkz.interview;

// write a program to check given number is prime or not

// Prime Number - a number that is divisible only by 1 and itself

public class Prime {

	public static void main(String[] args) {

		int num = 7;
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}