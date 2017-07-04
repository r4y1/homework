package logic1;

public class ShareDigit {
	boolean shareDigit(int a, int b) {
		boolean result;
		if (a % 10 == b % 10 || 
				a / 10 == b / 10 || 
				a % 10 == b / 10 || 
				a / 10 == b % 10) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
