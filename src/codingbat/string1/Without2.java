package string1;

public class Without2 {
	String without2(String str) {
		if (str.length() == 0) return "";
		if (str.length() == 1) return str;
		if (str.substring(0, 2).equals(str.substring(str.length() - 2))) return str.substring(2);
		return str;
	}
}
