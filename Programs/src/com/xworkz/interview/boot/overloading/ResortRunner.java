package com.xworkz.interview.boot.overloading;

public class ResortRunner {

	public static void main(String[] args) {

		Resort resort1 = new Resort();
		resort1.display();

		Resort resort2 = new Resort("vasavi", "adhar", "krishna", 789532);
		resort2.display();

	}

}
