package string2;

public class RepeatEnd {
	String repeatEnd(final String str, final int n) {
		final StringBuilder result = new StringBuilder();
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				result.append(str.substring(str.length() - n));
			}
		}
		return result.toString();
	}
}
