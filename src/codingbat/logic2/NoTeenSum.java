package logic2;

public class NoTeenSum {
	int noTeenSum(int a, int b, int c) {
		a = fixTeen(a);
		b = fixTeen(b);
		c = fixTeen(c);
		int result = a + b + c;
		return result;
	}
	int fixTeen(int n) {
		int result = n;
		if (n >= 13 && n <= 19) {
			result = 0;
		}
		if (n == 15 || n == 16) {
			result = n;
		}
		return result;
	}
}
