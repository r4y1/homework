package string1;

public class Left2 {
	String left2(String str) {
		if (str.length() < 3) return str;
		return str.substring(2) + str.substring(0, 2);
	}
}
