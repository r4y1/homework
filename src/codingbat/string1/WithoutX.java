package string1;

public class WithoutX {
	String withoutX(String str) {
		if (str.length() < 2) return "";
		if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') return str.substring(1, str.length() - 1);
		if (str.charAt(str.length() - 1) == 'x') return str.substring(0, str.length() - 1);
		if (str.charAt(0) == 'x') return str.substring(1); 
		return str;
	}
}
