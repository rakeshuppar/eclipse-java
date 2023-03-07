package com.xworkz.basics;

public class InttoString {

	public static void main(String[] args) {
		
		int a=10;
		
		String b=Integer.toString(a);
		System.out.println(b.charAt(0));
		
		String str="123523";
		int number=Integer.parseInt(str);
		System.out.println(number);
		
		char[] ch = {'h','e','l','o'};
        String str2=new String(ch);
		System.out.println(str2);
		
		int [] ints= {12,14,88,66};
		String str3=new String(ints);
		System.out.println(str3);
	

	}

}
