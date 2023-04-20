package com.xworkz.application.util;

import java.time.LocalDate;

public class EducationUtil {

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		} else {

		}
		return false;
	}

	public static boolean validint(int number) {
		if (number > 0 && number < 10000) {
			return true;
		} else {
		}
		return false;
	}

	public static boolean validDouble(double numbers) {
		if (numbers > 0 && numbers < 10000) {
			return true;
		} else {

		}
		return false;

	}

	public static boolean validDate(LocalDate date, LocalDate past) {

		LocalDate tomarrowDate = LocalDate.now().plusDays(1);
		LocalDate pastDate = LocalDate.of(2015, 12, 31);

		if (date != null && date.isBefore(tomarrowDate) && date.isAfter(pastDate)) {
			return true;
		} else {

		}
		return false;

	}

	public static boolean vaildFlag(boolean... flag) {
		for (int index = 0; index < flag.length; index++) {
			boolean temp = flag[index];

			if (!temp) {
				return false;
			}
		}
		return true;

	}
}
