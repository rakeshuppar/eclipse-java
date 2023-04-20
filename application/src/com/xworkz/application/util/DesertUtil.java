package com.xworkz.application.util;

public class DesertUtil {
	
	public static boolean validString(String value) {

		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		} else {
		}
		return false;
	}

	public static boolean validInt(int number) {

		if (number > 0 && number < 1000000) {
			return true;

		} else {
		}
		return false;
	}
	
	public static boolean validdouble(double number) {

		if (number > 0 && number < 1000000) {
			return true;

		} else {
		}
		return false;
	}

	public static boolean validFlag(boolean...flag) {

		for (int index = 0; index < flag.length; index++) {
			boolean temp = flag[index];

			if (!temp) {
				System.out.println("invalid flag at index"+index);
				return false;
			}
		}
		return true;

	}
}
