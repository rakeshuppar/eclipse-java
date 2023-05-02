package com.xworkz.smart.boot;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.smart.configuration.StudentConfiguration;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);

		System.out.println("---------------------------By using String-----------------------------");
		System.out.println(context.getBean("name", String.class));
		System.out.println(context.getBean("graduation", String.class));
		System.out.println(context.getBean("from", String.class));
		System.out.println(context.getBean("age", String.class));
		System.out.println(context.getBean("gender", String.class));
		System.out.println(context.getBean("school", String.class));
		System.out.println(context.getBean("college", String.class));
		System.out.println(context.getBean("engineering", String.class));
		System.out.println(context.getBean("taluk", String.class));
		System.out.println(context.getBean("district", String.class));
		System.out.println(context.getBean("state", String.class));
		System.out.println(context.getBean("country", String.class));
		System.out.println(context.getBean("continent", String.class));

		System.out.println("---------------------------By using Integer Wrapper Class-------------------------------");
		System.out.println(context.getBean("naturalNumber", Integer.class));
		System.out.println(context.getBean("primeNumber", Integer.class));
		System.out.println(context.getBean("compositeNumber", Integer.class));
		System.out.println(context.getBean("wholeNumber", Integer.class));
		System.out.println(context.getBean("integers", Integer.class));
		System.out.println(context.getBean("integers1", Integer.class));
		System.out.println(context.getBean("naturalNumber2", Integer.class));
		System.out.println(context.getBean("real", Integer.class));
		System.out.println(context.getBean("real1", Integer.class));

		System.out.println("----------------------------By using Boolean Wrapper Class------------------------------");
		System.out.println(context.getBean("sanketHavePassport", Boolean.class));
		System.out.println(context.getBean("shivuHavePassport", Boolean.class));
		System.out.println(context.getBean("basuHavePassport", Boolean.class));
		System.out.println(context.getBean("kavanHavePassport", Boolean.class));
		System.out.println(context.getBean("shrutiHavePassport", Boolean.class));
		System.out.println(context.getBean("anneshHavePassport", Boolean.class));
		System.out.println(context.getBean("anitaHavePassport", Boolean.class));
		System.out.println(context.getBean("shubhangiHavePassport", Boolean.class));
		System.out.println(context.getBean("akshataHavePassport", Boolean.class));

		System.out.println("--------------------------By using Byte Wrapper Class----------------------------------");
		System.out.println(context.getBean("afghanistanId", Byte.class));
		System.out.println(context.getBean("albaniaId", Byte.class));
		System.out.println(context.getBean("algeriaId", Byte.class));
		System.out.println(context.getBean("angolaId", Byte.class));
		System.out.println(context.getBean("argentineId", Byte.class));
		System.out.println(context.getBean("australiaId", Byte.class));
		System.out.println(context.getBean("bangldeshId", Byte.class));
		System.out.println(context.getBean("belgiumId", Byte.class));
		System.out.println(context.getBean("bhutanId", Byte.class));

		System.out.println("-----------------------By using Long Wrapper Class--------------------------------------");
		System.out.println(context.getBean("anneshPin", Long.class));
		System.out.println(context.getBean("sanketPin", Long.class));
		System.out.println(context.getBean("kavanPin", Long.class));
		System.out.println(context.getBean("anitaPin", Long.class));
		System.out.println(context.getBean("basavarajPin", Long.class));
		System.out.println(context.getBean("shrutiPin", Long.class));
		System.out.println(context.getBean("rakeshPin", Long.class));
		System.out.println(context.getBean("shivuPin", Long.class));
		System.out.println(context.getBean("dinakarPin", Long.class));

		System.out.println("-----------------------By using Float Wrapper Class-------------------------------------");
		System.out.println(context.getBean("anneshCgpa", Float.class));
		System.out.println(context.getBean("rakeshCgpa", Float.class));
		System.out.println(context.getBean("sanketCgpa", Float.class));
		System.out.println(context.getBean("antitaCgpa", Float.class));
		System.out.println(context.getBean("basavarajCgpa", Float.class));
		System.out.println(context.getBean("kavanCgpa", Float.class));
		System.out.println(context.getBean("shivuCgpa", Float.class));
		System.out.println(context.getBean("dinakarCgpa", Float.class));
		System.out.println(context.getBean("shubangiCgpa", Float.class));

		System.out.println("--------------------By using Double Wrapper Class---------------------------------------");
		System.out.println(context.getBean("sanketPercentage", Double.class));
		System.out.println(context.getBean("dinakarPercentage", Double.class));
		System.out.println(context.getBean("basavarsjPercentage", Double.class));
		System.out.println(context.getBean("kavanPercentage", Double.class));
		System.out.println(context.getBean("rakeshPercentage", Double.class));
		System.out.println(context.getBean("anitPpercentage", Double.class));
		System.out.println(context.getBean("shrutiPercentage", Double.class));
		System.out.println(context.getBean("anneshPercentage", Double.class));
		System.out.println(context.getBean("shivuPercentage", Double.class));

		System.out.println("----------------------By using Character Wrapper Class------------------------------");
		System.out.println(context.getBean("anneshGrade", Character.class));
		System.out.println(context.getBean("rakeshGrade", Character.class));
		System.out.println(context.getBean("basavarajGrade", Character.class));
		System.out.println(context.getBean("kavanGrade", Character.class));
		System.out.println(context.getBean("shivuGrade", Character.class));
		System.out.println(context.getBean("dinakarGrade", Character.class));
		System.out.println(context.getBean("sanketGrade", Character.class));
		System.out.println(context.getBean("shrutiGrade", Character.class));
		System.out.println(context.getBean("shubhangiGrade", Character.class));

		System.out.println("------------------------By using Short Wrapper Class----------------------------");
		System.out.println(context.getBean("anneshYear", Short.class));
		System.out.println(context.getBean("dinakarYear", Short.class));
		System.out.println(context.getBean("shivuYear", Short.class));
		System.out.println(context.getBean("kavanYear", Short.class));
		System.out.println(context.getBean("basavarajYear", Short.class));
		System.out.println(context.getBean("rakeshYear", Short.class));
		System.out.println(context.getBean("sanketYear", Short.class));
		System.out.println(context.getBean("shrutiYear", Short.class));
		System.out.println(context.getBean("shubhangiYear", Short.class));

		System.out.println("---------------------By using arrylist-----------------------------");
		List<String> ref = context.getBean("adress", List.class);
		ref.forEach(System.out::println);
		System.out.println(context.getBean("adress", List.class));

		System.out.println("----------------------By using linkedlist-----------------------------");
		// List<String> ref1 = context.getBean("email", List.class);
		// ref1.forEach(System.out::println);
		System.out.println(context.getBean("email", List.class));

		System.out.println("------------------------By using Hash Set-------------------------------");
		// Set<String> ref2 = context.getBean("wineTypes", Set.class);
		// ref2.forEach(System.out::println);
		System.out.println(context.getBean("wineTypes", Set.class));

		System.out.println("----------------------By using Linked Hash Set-------------------------");
		// Set<String> ref3 = context.getBean("laptops", Set.class);
		// ref3.forEach(System.out::println);
		System.out.println(context.getBean("laptops", Set.class));

		System.out.println("-----------------------By using Tree Set----------------------------------");
		// Set<String> ref4 = context.getBean("course", Set.class);
		// ref4.forEach(System.out::println);
		System.out.println(context.getBean("course", Set.class));

		System.out.println("----------------------------------------------------------------------------");
		System.out.println("number of beans:" + context.getBeanDefinitionCount());
		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);

	}

}
