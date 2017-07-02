package string1;

public class ComboString {
	String comboString(String a, String b) {
		return a.length() > b.length() ? b + a + b : a + b + a;
	}
}
