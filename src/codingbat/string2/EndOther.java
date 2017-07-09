package string2;

public class EndOther {
	boolean endOther(String a, String b) {
		boolean isEndOther;
		int aLen = a.length();
		int bLen = b.length();
		if (aLen > bLen) {
			isEndOther = a.substring(aLen - bLen, aLen).toLowerCase().equals(b.toLowerCase());
		} else {
			isEndOther = b.substring(bLen - aLen, bLen).toLowerCase().equals(a.toLowerCase());
		}
		return isEndOther;
	}
}
