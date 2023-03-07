package com.xworkz.basics;

public class DuplicateCharacter {

	public static void main(String[] args) {

		String sentence = "This is java class";
		int count = 0;

		char String[] = sentence.toCharArray();
		System.out.println("Duplicate characters in given string");

		for (int i = 0; i < String.length; i++) {
			count = 1;
			for (int j = i + 1; j < String.length; j++) {
				if (String[i] == String[j] && String[i] != ' ') {
					count++;
					String[j] = '0';

				}
			}
			if (count > 1 && String[i] != '0') {
				System.out.println(String[i]);
			}

		}

	}
}
