package string1;

public class WithoutX2 {
	String withoutX2(String str) {
		if (str.equals("x") || str.equals("xx") || str.equals("")) return "";
		if (str.charAt(0) == 'x' && str.charAt(1) == 'x') return str.substring(Math.abs(2 - str.length()));
		if (str.charAt(0) == 'x') return str.substring(1);
		if (str.charAt(1) == 'x') return str.substring(0, 1) + str.substring(2);
		return str;
	}
}
