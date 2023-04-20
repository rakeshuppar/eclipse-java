package com.xworkz.collect.util;

public class SnakeUtil {

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
