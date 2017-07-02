package string1;

public class TwoChar {
	String twoChar(String str, int index) {
		if (index > str.length() || index + 2 > str.length() || index < 0) return str.substring(0, 2);
		return str.substring(index, index + 2);
	}
}
