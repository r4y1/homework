package codingbat.string2;

public class MixString {
	String mixString(String a, String b) {
		StringBuilder result = new StringBuilder();
		int minLen = Math.min(a.length(), b.length());
		for (int i = 0; i < minLen; i++) {
			result.append(a.charAt(i)).append(b.charAt(i));
		}
		if (a.length() > b.length()) {
			result.append(a.substring(minLen));
		} else if (a.length() < b.length()) {
			result.append(b.substring(minLen));
		}
		return result.toString();
	}
}
