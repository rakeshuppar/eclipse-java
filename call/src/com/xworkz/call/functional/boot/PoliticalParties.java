package com.xworkz.call.functional.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PoliticalParties {
	public static void main(String[] args) {

		Collection<String> parties = new ArrayList<String>();

		parties.add("Bjp");
		parties.add("Congress");
		parties.add("Aap");
		parties.add("Jds");
		parties.add("Jdu");

//		System.out.println("-----------By using for each---------");
//
//		for (String part : parties) {
//			System.out.println(part);
//
//		}
//
//		System.out.println("---------By using for each method-----------");
//		
//		Collection<String> convertedParties=new ArrayList<String>();
//		
//		parties.forEach(e -> System.out.println(e));
//		convertedParties.addAll(parties);
//		convertedParties.forEach(e->System.out.println(e.toUpperCase()));
//		
		System.out.println("=========By Using Straem===========");

		parties.stream().map(element -> element.toUpperCase()).collect(Collectors.toList()).forEach(e -> System.out.println(e));
	}

}
