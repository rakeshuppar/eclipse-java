package com.xworkz.interview;

public class Palindrome {

	public static void main(String[] args) {

		String str = "WOW";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("palindrome string");
		}

		else {
			System.out.println("not a palindrome string");
		}
	}
}
