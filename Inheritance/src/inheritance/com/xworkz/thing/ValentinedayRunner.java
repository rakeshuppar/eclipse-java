package inheritance.com.xworkz.thing;

import inheritance.com.xworkz.boot.Feb14;
import inheritance.com.xworkz.boot.ValentineDay;

public class ValentinedayRunner {

	public static void main(String[] args) {

		Feb14 feb14 = new Feb14();
		feb14.month("Feb");
		String month = feb14.getMonth();
		System.out.println("month:" + month);
		feb14.propose();

		ValentineDay valentineday = new Feb14();
		valentineday.month("Feb");
		String month1 = valentineday.getMonth();
		System.out.println("month1:" + month1);

		Feb14 casted = (Feb14) valentineday;
		casted.propose();

	}
}
