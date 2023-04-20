package com.xworkz.call.boot;

import java.util.ArrayList;
import java.util.Collection;

public class dressRunner {

	public static void main(String[] args) {

		Collection<String> menSize = new ArrayList<>();
		menSize.add("length");
		menSize.add("medium");
		menSize.add("xl");
		menSize.add("xxl");
		menSize.add("short");

		Collection<String> womenSize = new ArrayList<>();
		womenSize.add("length");
		womenSize.add("small");
		womenSize.add("long");
		womenSize.add("xxl");
		womenSize.add("short");
		
		Collection<String> allSize=new ArrayList<String>();
		allSize.addAll(menSize);
		allSize.addAll(womenSize);
		System.out.println("Allsizes:"+allSize);

		allSize.removeAll(womenSize);

    	System.out.println("-----------------removeall(Remove WomenDressSize from AllDressSize)-----------");

		for (String size : menSize) {
			System.out.println(size);
		}

		System.out.println("--------------   addall(Add MenDressSize and womenDressSize)-----------------------");

		menSize.addAll(womenSize);

		for (String size : menSize) {
			System.out.println(size);
		}
		System.out.println(" ---------------------retainall(Retain MenDresssize from AllDressSize)------------");

		menSize.retainAll(allSize);

		for (String size : menSize) {
			System.out.println(size);
		}

	}
}
