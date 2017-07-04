package logic1;

public class SumLimit {
	int sumLimit(int a, int b) {
		int result;
		String strA = String.valueOf(a);
		String strAB = String.valueOf(a + b);
		if (strAB.length() > strA.length()) {
			result = a;
		} else {
			result = a + b;
		}
		return result;
	}
}
