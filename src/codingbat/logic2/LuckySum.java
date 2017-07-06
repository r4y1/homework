package logic2;

public class LuckySum {
	int luckySum(int a, int b, int c) {
		int result = a + b + c;
		if (a == 13) {
			result = 0;
		} else if (b == 13) {
			result = a;
		} else if (c == 13) {
			result = a + b;
		}
		return result;
	}
}
