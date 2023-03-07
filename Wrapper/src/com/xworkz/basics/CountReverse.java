package com.xworkz.basics;

public class CountReverse {

	public static void main(String[] args) {
		
		String sentence="this is java class";
		int Wordcount=0;
		
        String [] count=sentence.split(" ", Wordcount);
		int length=count.length;
		System.out.println(length);
		
		char ch[] = sentence.toCharArray();
		String rev ="";

		for (int i = ch.length - 1; i >= 0; i--) {
			
			rev += ch[i];
		}
		System.out.println(rev);
	}
	
}
