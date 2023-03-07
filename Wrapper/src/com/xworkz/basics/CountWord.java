package com.xworkz.basics;

public class CountWord {

	public static void main(String[] args) {

		String sentence = "Beauty lies in the eyes of beholder";
		int Wordcount = 0;

		for (int i = 0; i < sentence.length() - 1; i++) {
			if (sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i + 1)) && (i > 0)) {
				Wordcount++;
			}
		}

		Wordcount++;
		System.out.println(Wordcount);

		
		
		String [] count=sentence.split(" ", Wordcount);
		int length=count.length;
		System.out.println(length);
	}

}
