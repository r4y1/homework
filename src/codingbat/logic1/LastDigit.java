package logic1;

public class LastDigit {
	boolean lastDigit(int a, int b, int c) {
		boolean result = false;
		if (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10) {
			result = true;
		}
		return result;
	}
}
