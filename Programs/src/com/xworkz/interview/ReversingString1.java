package com.xworkz.interview;

// Write a Java Program to reverse a string
// without using String inbuilt function reverse()

public class ReversingString1 {

	public static void main(String[] args) {

		String str = "Word";
		char ref[] = str.toCharArray(); 

		for (int i = ref.length - 1; i >= 0; i--) {
			System.out.print(ref[i]);
		}
	}

}