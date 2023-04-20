package com.xworkz.call.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {

		Collection<Integer> collection = new ArrayList<>();
		collection.add(99452);
		collection.add(78451);
		collection.add(56554);
		collection.add(94555);
		collection.add(75615);
		collection.add(13232);
		collection.add(51213);
		collection.add(66595);
		collection.add(98222);
		collection.add(98845);
		System.out.println("collection integernumbers are:" + collection);

		int size = collection.size();
		System.out.println("size is:" + size);

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Collection<String> ref = new ArrayList<>();
		ref.add("Rakesh");
		ref.add("Basavaraj");
		ref.add("Shreehari");
		ref.add("Shrishail");
		ref.add("Pradeepkumar");
		ref.add("Sagar");
		ref.add("Kavan");
		ref.add("Santosh");
		ref.add("Irfan");
		ref.add("Sadashiva");
		System.out.println("collection Stringnames are:" + ref);

		int size1 = ref.size();
		System.out.println("size is:" + size1);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Collection<Double> ref1 = new ArrayList<>();
		ref1.add(60.0);
		ref1.add(70.0);
		ref1.add(65.0);
		ref1.add(88.0);
		ref1.add(75.0);
		ref1.add(78.0);
		ref1.add(55.0);
		ref1.add(60.0);
		ref1.add(55.0);
		ref1.add(75.0);
		System.out.println("collection doublepercenatage are:" + ref);

		int size2 = ref.size();
		System.out.println("size is:" + size2);

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Collection<Float> ref2 = new LinkedList<>();
		ref2.add(8.0f);
		ref2.add(6.0f);
		ref2.add(9.0f);
		ref2.add(7.75f);
		ref2.add(9.0f);
		ref2.add(8.5f);
		ref2.add(9.1f);
		ref2.add(6.5f);
		ref2.add(6.5f);
		ref2.add(6.80f);
		ref2.add(8.85f);
		System.out.println("collection floatCGPA are:" + ref2);

		int size3 = ref.size();
		System.out.println("size is:" + size3);

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++===++++++");

		Collection<Boolean> ref3 = new ArrayList<>();
		ref3.add(false);
		ref3.add(false);
		ref3.add(false);
		ref3.add(false);
		ref3.add(true);
		ref3.add(false);
		ref3.add(true);
		ref3.add(true);
		ref3.add(true);
		ref3.add(false);
		ref3.add(false);
		System.out.println("collection booleanDiploma based:" + ref3);

		int size4 = ref.size();
		System.out.println("size is:" + size4);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Collection<Character> ref4 = new ArrayList<>();
		ref4.add('R');
		ref4.add('S');
		ref4.add('D');
		ref4.add('J');
		ref4.add('I');
		ref4.add('S');
		ref4.add('O');
		ref4.add('K');
		ref4.add('B');
		ref4.add('A');
		System.out.println("collection FirstCharacter are:" + ref4);

		int size5 = ref4.size();
		System.out.println("size is:" + size5);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Collection<Byte> ref5 = new LinkedList<>();
		ref5.add((byte) 100);
		ref5.add((byte) 110);
		ref5.add((byte) 55);
		ref5.add((byte) 88);
		ref5.add((byte) 75);
		ref5.add((byte) 99);
		ref5.add((byte) 71);
		ref5.add((byte) 66);
		ref5.add((byte) 78);
		ref5.add((byte) 66);
		System.out.println("collection bytemarks are:" + ref5);

		int size6 = ref5.size();
		System.out.println("size is:" + size6);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Collection<Short> ref6 = new LinkedList<>();
		ref6.add((short) 4);
		ref6.add((short) 2);
		ref6.add((short) 1);
		ref6.add((short) 3);
		ref6.add((short) 2);
		ref6.add((short) 4);
		ref6.add((short) 3);
		ref6.add((short) 5);
		ref6.add((short) 6);
		ref6.add((short) 2);
		System.out.println("collection shortbacklogs are:" + ref6);

		int size7 = ref6.size();
		System.out.println("size is:" + size7);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Collection<Long> ref7 = new LinkedList<>();
		ref7.add((long) 22);
		ref7.add((long) 21);
		ref7.add((long) 25);
		ref7.add((long) 24);
		ref7.add((long) 25);
		ref7.add((long) 28);
		ref7.add((long) 24);
		ref7.add((long) 24);
		ref7.add((long) 26);
		ref7.add((long) 23);
		System.out.println("collection longages are:" + ref6);

		int size8 = ref7.size();
		System.out.println("size is:" + size8);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}

}
