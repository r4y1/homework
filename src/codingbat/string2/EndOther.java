package string2;

public class EndOther {
	boolean endOther(final String a, final String b) {
		boolean isEndOther;
		final int aLen = a.length();
		final int bLen = b.length();
		if (aLen > bLen) {
			isEndOther = a.substring(aLen - bLen, aLen).toLowerCase().equals(b.toLowerCase());
		} else {
			isEndOther = b.substring(bLen - aLen, bLen).toLowerCase().equals(a.toLowerCase());
		}
		return isEndOther;
	}
}
