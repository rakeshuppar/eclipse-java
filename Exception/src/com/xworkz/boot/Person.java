package com.xworkz.boot;

public class Person {

	public static void main(String[] args) {
		
		
		try {
			
			int[] num= {1,2,3,45,46,8};
			System.out.println(num);
}
			
		} catch (Exception event) {
			System.out.println("catch block");
			event.getMessage();
			event.getCause();
		}

	}

}
