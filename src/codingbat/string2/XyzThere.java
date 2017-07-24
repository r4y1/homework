package string2;

public class XyzThere {
	boolean xyzThere(final String str) {
		boolean isXyzThere = false;
		if (str.length() >= 3 && str.substring(0, 3).equals("xyz")) {
			isXyzThere = true;
		}
		for (int i = 1; i < str.length() - 2; i++) {
			if (str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz")) {
				isXyzThere = true;
			}
		}
		return isXyzThere;
	}
}
