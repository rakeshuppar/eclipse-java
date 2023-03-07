package com.xworkz.basics;

public class StringRunner {

	public static void main(String[] args) {

		String name = "Rakesh";
		String name2 = "Basu Mandi";
		name = name.concat(" Uppar");
		
		
		System.out.println(name);
		System.out.println(String.valueOf(name));
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
		System.out.println(name.subSequence(7, 12));
		System.out.println(name.codePointAt(1));
		System.out.println(name.codePointBefore(3));
		System.out.println(name.codePointCount(0, 12));
		System.out.println(name.compareTo(name2));
		System.out.println(name.compareToIgnoreCase(name2));
		System.out.println(name.contains(name2));
		System.out.println(name.contentEquals(name2));
		System.out.println(name.endsWith(name2));
		System.out.println(name.equals(name));
		System.out.println(name.equalsIgnoreCase(name2));
		System.out.println(name.indexOf(0));
		System.out.println(name.indexOf(name));
		System.out.println(name.indexOf(0, 1));
		System.out.println(name.intern());
		System.out.println(name.isEmpty());
		System.out.println(name.lastIndexOf(0));
		System.out.println(name.lastIndexOf(name));
		System.out.println(name.lastIndexOf(1, 2));
		System.out.println(name.lastIndexOf(name2, 1));
		System.out.println(name.matches(name2));
		System.out.println(name.offsetByCodePoints(0, 3));
		System.out.println(name.regionMatches(false, 0, name2, 0, 0));
		System.out.println(name.regionMatches(0, name2, 0, 0));
		System.out.println(name.replace(name, name2));
		System.out.println(name.replaceAll(name, name2));
		System.out.println(name.replaceFirst(name, name2));
		System.out.println(name.startsWith(name));
		System.out.println(name.startsWith(name, 0));
		System.out.println(name.substring(5));
		System.out.println(name.substring(0, 1));
		System.out.println(name.toCharArray());
		System.out.println(name.toString());
		System.out.println(name.getClass());
		System.out.println(name.split(name));
		System.out.println(name.split(name, 1));
		System.out.println(name.subSequence(0, 2));
		System.out.println(name.chars());
		System.out.println(name.codePoints());
		System.out.println(name.getBytes());
		System.out.println(name.getBytes());
		System.out.println(name.contains("Uppar"));
		System.out.println(name.contentEquals(name));
		
		
		String name1="Sanket is very good boy";
		String[] count=name1.split("");
		int length=count.length;
		System.out.println(length);
		
		
		System.out.println(name1.substring(15, 19));
		
		char ch[]=String.
		String name2="good";
		
		for(int i=0;i>length-1;i--) {
			i++;
		System.out.println(name2);
		}
		
		
		
		
		
		
		
		

	}

}
