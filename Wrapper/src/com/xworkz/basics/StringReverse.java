package com.xworkz.basics;

public class StringReverse {

	public static void main(String[] args) {

		String str = "RAKESH UPPAR";

		char ch[] = str.toCharArray();
		String rev ="";

		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		System.out.println(rev);
		
		
		

	}

}
