package logic2;

public class LoneSum {
	int loneSum(int a, int b, int c) {
		int sum = a + b + c;
		if (a == b && b ==c ) {
			sum = 0;
		} else if (a == b) {
			sum = c;
		} else if (a == c) {
			sum = b;
		} else if (b == c) {
			sum = a;
		}
		return sum;
	}
}
