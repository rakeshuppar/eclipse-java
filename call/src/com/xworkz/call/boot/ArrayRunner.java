package com.xworkz.call.boot;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayRunner {
	public static void main(String[] args) {

		Collection<Object> c = new ArrayList<>();
		c.add(100);
		c.add(true);
		c.add(3.14);
		c.add('A');
		c.add("Rakesh");
		System.out.println(c);

		Object arr[] = c.toArray();

		for (Object o : arr) {
			System.out.println(o);
		}

		Object arr1[] = c.toArray();

		for (Object object : arr1) {
			System.out.println(object);

		}
		
	//	String array[]=c.toArray(new String[] {});
	
	//	for (String obj : array) {
	//		System.out.println(obj);
			
	//	}

	}

}
