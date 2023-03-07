package com.xworkz.basics;

public class CountOvelsConstunents {

	int vCount = 0;
	int cCount = 0;

	String str="This is Demo class";

	for(
	int i = 0;i<str.length();i++)
	{

		if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
				|| str.charAt(i) == 'u')
			;

		vCount++;

	}

	else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){

		cCount++;
	}

	sysout
}
