package logic1;

public class TwoAsOne {
	boolean twoAsOne(int a, int b, int c) {
		boolean result = false;
		if (a + b == c || a + c == b || b + c == a) {
			result = true;
		}
		return result;
	}
}
