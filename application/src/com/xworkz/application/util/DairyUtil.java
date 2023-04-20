package com.xworkz.application.util;

public class DairyUtil {

	public static boolean validString(String value) {

		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;

		}
		return false;

	}

	public static boolean validnum(double num) {
		if (num > 0.0 && num < 12.0) {
			return true;
		}
		return false;
	}

	public static boolean validFlag(boolean... flag) {
		for (int i = 0; i < flag.length; i++) {
			boolean temp = flag[i];
			if (!temp) {
				return false;
			}
		}
		return true;
	}
}
