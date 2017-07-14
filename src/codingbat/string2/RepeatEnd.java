package codingbat.string2;

public class RepeatEnd {
	String repeatEnd(String str, int n) {
		StringBuilder result = new StringBuilder();
		if (n > 0) {
			for (int i = 0; i < n; i++) {
			    result.append(str.substring(str.length() - n));
			}
		}
		return result.toString();
	}
}
