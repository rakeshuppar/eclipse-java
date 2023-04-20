package com.xworkz.call.functional.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class EmailRunner {

	public static void main(String[] args) {

		Collection<String> email = new ArrayList<String>();
		email.add("rakesh@gmail.com");
		email.add("basu@gmail.com");
		email.add("annesh@gmail.com");
		email.add("sanket@gmail.com");
		email.add("shruti@gmail.com");
		email.add("rakesh@outlook.com");
		email.add("basu@outlook.com");
		email.add("annesh@outlook.com");
		email.add("sanket@outlook.com");
		email.add("shruti@outlook.com");
		email.add("rakesh@yahoo.com");
		email.add("shruti@yahoo.com");
		email.add("avinash@yahoo.com");
		email.add("pradeep@yahoo.com");
		email.add("shree@yahoo.com");
		email.add("rakesh@xworkz.com");
		email.add("pradeep@xworkz.com");
		email.add("shree@xworkz.com");
		email.add("prajwal@xworkz.com");
		email.add("avinash@xworkz.com");
		email.add("shrishail@xworkz.com");
		email.add("basu@xworkz.com");
		email.add("priya@xworkz.com");
		email.add("shwetha@xworkz.com");
		email.add("deepa@xworkz.com");

		System.out.println("---------all emails in uppercaselater--------------");
		email.forEach(e -> {
			System.out.println(e.toUpperCase());
		});

		System.out.println("-----------all unique domain only---------------");
		email.stream().map(e -> e.split("@")[1]).collect(Collectors.toSet()).forEach(e -> System.out.println(e));

		System.out.println("-----------all email without domain----------------");

		email.stream().map(e -> e.split("@")[0]).collect(Collectors.toSet()).forEach(e -> System.out.println(e));

		System.out.println("----------------------only @gmails.com-----------------------------");
		email.stream().filter(e -> e.endsWith("@gmail.com")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("--------------------only @xworkz.com-----------------------");
		email.stream().filter(e -> e.endsWith("@xworkz.com")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("-------------------not @gmail.com and @xworks.com----------------");

		email.stream().filter(e -> !e.endsWith("gmail.com") && !e.endsWith("xworkz.com")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
	}
}