package logic1;

public class MaxMod5 {
	int maxMod5(int a, int b) {
		int result;
		if (a == b) {
			result = 0;
		} else if (a % 5 == b % 5) {
			result = a < b ? a : b;
		} else {
			result = a > b ? a : b;
		}
		return result;
	}
}
