package string1;

public class AtFirst {
	String atFirst(String str) {
		if (str.length() == 1) return str + "@";
		if (str.length() == 0) return "@@";
		return str.substring(0, 2);
	}
}
