package com.xworkz.basics;
import java.util.*;

public class RemoveDuplicateCharacter {

	
	
	static void removeDuplicate(char str[],int length) {
		int index=0;
		
		for(int i=0;i<length;i++) {
			
			int j;
			for(j=0;j<i;j++) {
				if(str[i]==str[j])
				{
					break;
				}
			}
			if(j==i) {
				str[index++]=str[i];
			}
		}
		System.out.println(String.ValueOf(Array.copyOf(str.index)));

	}

	private static void removeDuplicate(int length) {
		// TODO Auto-generated method stub
		
	}

}
