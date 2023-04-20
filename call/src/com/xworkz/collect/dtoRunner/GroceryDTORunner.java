package com.xworkz.collect.dtoRunner;

import com.xworkz.collect.dto.GroceryDTO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

public class GroceryDTORunner {

	public static void main(String[] args) {

		GroceryDTO gro = new GroceryDTO(0, "teapowder", 50, 0.250);
		GroceryDTO gro1 = new GroceryDTO(1, "sugar", 40, 1.0);
		GroceryDTO gro2 = new GroceryDTO(2, "rice", 1000, 25.0);
		GroceryDTO gro3 = new GroceryDTO(3, "dal", 100, 1.0);
		GroceryDTO gro4 = new GroceryDTO(4, "soap", 20, 1);
		GroceryDTO gro5 = new GroceryDTO(5, "toothpaste", 20, 1);
		GroceryDTO gro6 = new GroceryDTO(6, "shampoo", 2, 1);
		GroceryDTO gro7 = new GroceryDTO(7, "edibla oil", 60, 1.0);
		GroceryDTO gro8 = new GroceryDTO(8, "rava", 50, 1.0);
		GroceryDTO gro9 = new GroceryDTO(9, "avalakki", 40, 1.0);

		Set<GroceryDTO> grocery = new HashSet<>(10);
		grocery.add(gro);
		grocery.add(gro1);
		grocery.add(gro2);
		grocery.add(gro3);
		grocery.add(gro4);
		grocery.add(gro5);
		grocery.add(gro6);
		grocery.add(gro7);
		grocery.add(gro8);
		grocery.add(gro9);

		for (GroceryDTO groceryDTO : grocery) {
			System.out.println(groceryDTO);

		}

		System.out.println("--------------convert set to list---------------------");

		List<GroceryDTO> list = grocery.stream().collect(Collectors.toList());
		list.forEach(e -> System.out.println(e));

		System.out.println("------------------at index 2--------------------");
		System.out.println(list.get(2));

		System.out.println("---------------remove at index 3----------------");
		list.remove(3);
		list.forEach(e -> System.out.println(e));

		System.out.println("----------------add all with index-------------------");

		List<GroceryDTO> list1 = new ArrayList<>();
		list1.add(new GroceryDTO(12, "corn", 50.0, 1.0));
		list.addAll(2, list1);
		list.forEach(e -> System.out.println(e));

		System.out.println("-----------------iterator from revese direction-------------");

		ListIterator<GroceryDTO> iterator = list.listIterator(list.size());
		while (iterator.hasPrevious()) {
			GroceryDTO it = iterator.previous();
			System.out.println(it);
		}

		System.out.println("-------------adding element over iteration------------");

	}
}