package com.xworkz.interview;

import java.util.Scanner;

public class ReverseString {

	public static void reverseString(char[] ch, int length) {
		if (length > 0) {

			System.out.println(ch[length - 1]);
			length--;
			reverseString(ch, length);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");

		String str = sc.nextLine();
		char[] ch = str.toCharArray(); // convert string into character array
		int length = ch.length;
		reverseString(ch, length);

	}

}
