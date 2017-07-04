package logic1;

public class InOrderEqual {
	boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		boolean result = false;
		if (equalOk) {
			result = a <= b && b <= c;
		} else {
			result = a < b && b < c;
		}
		return result;
	}
}
