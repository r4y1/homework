package string1;

public class Right2 {
	String right2(String str) {
		if (str.length() < 3) return str;
		return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
	}
}
