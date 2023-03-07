package com.xworkz.boot.mondayRunner;

import com.xworkz.things.monday.Paint;

public class PaintRunner {

	public static void main(String[] args) {

		Paint paint = new Paint();
		paint.setBrand("Asian");
		paint.setCost(5000);
		paint.setSize('m');
		paint.setYear(2020);
		System.out.println(paint);

		Paint paint1 = new Paint();
		paint1.setBrand("Nerolec");
		paint1.setCost(2000);
		paint1.setSize('l');
		paint1.setYear(2022);
		System.out.println(paint1);

		System.out.println("Hashcode of Paint is: " + paint.hashCode() + "  Original HashCode of Paint is"
				+ System.identityHashCode(paint));

		System.out.println(paint.equals(paint1));

	}

}
