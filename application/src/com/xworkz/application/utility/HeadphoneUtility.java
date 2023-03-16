package com.xworkz.application.utility;

import java.time.LocalDate;

public class HeadphoneUtility {

	 public static boolean validString(String value)

	{
		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		} else {
		}
		return false;
	}

	public static boolean validNumber(int number) {

		if (number > 0 && number < 1000) {
			return true;
		} else {
		}
		return false;
	}

	public static boolean validNumbers(double numbers) {

		if (numbers > 0 && numbers < 1000) {
			return true;
		} else {
		}
		return false;

	}

	public static boolean validDate(LocalDate date, LocalDate past) {

		LocalDate tomarrow = date.now().plusDays(1);
		LocalDate past1= date.of(2015, 6, 6);

		if (date != null && date.isBefore(tomarrow) && date.isAfter(past1)) {
			return true;
		} else {
		}
		return false;
	}

	public static boolean validFlag(boolean... flag) {

		for (int index = 0; index < flag.length; index++) {
			boolean temp = flag[index];

			if (temp) {
				return true;
			}
		}
		return false;

	}

}
