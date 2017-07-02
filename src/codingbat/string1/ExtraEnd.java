package string1;

public class ExtraEnd {
	String extraEnd(String str) {
		String last2 = str.substring(str.length() - 2, str.length());
		return last2 + last2 + last2;
	}
}
