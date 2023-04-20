package com.xworkz.application.util;

public class AddressUtil {

	public static boolean validString(String value) {

		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		} else {
		}
		return false;
	}

	public static boolean validint(int number) {

		if (number > 0 && number < 1000000) {
			return true;

		} else {
		}
		return false;
	}

	public static boolean validFlag(boolean... flag) {

		for (int index = 0; index < flag.length; index++) {
			boolean temp = flag[index];

			if (!temp) {
				return false;
			}
		}
		return true;

	}
}
