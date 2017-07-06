package logic2;

public class RoundSum {
	int roundSum(int a, int b, int c) {
		int rA = round10(a);
		int rB = round10(b);
		int rC = round10(c);
		int result = rA + rB + rC;
		return result;
	}
	int round10(int num) {
		int result = num;
		if (num < 10 && num >= 5) {
			result = 10;
		}
		if (num < 5) {
			result = 0;
		}
		if (num % 10 >= 5) {
			result = (num / 10 + 1 ) * 10;
		}
		if (num % 10 < 5) {
			result = (num / 10 ) * 10;
		}
		return result;
	}
}
