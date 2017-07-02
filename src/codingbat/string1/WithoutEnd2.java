package string1;

public class WithoutEnd2 {
	String withoutEnd2(String str) {
		if (str.length() < 3) return "";
		if (str.length() == 3) return str.substring(1, 2);
		return str.substring(1, str.length() - 1);
	}
}
