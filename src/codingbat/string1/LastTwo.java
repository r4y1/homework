package string1;

public class LastTwo {
	String lastTwo(String str) {
		if (str.length() < 2) return str;
		if (str.length() == 2) return str.substring(str.length() - 1) + str.substring(0, 1);
		return str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() -1);
	}
}
