package logic1;

public class SortaSum {
	int sortaSum(int a, int b) {
		int result = 0;
		int sum = a + b;
		if (sum >= 10 && sum <= 19) {
			result = 20;
		} else {
			result = sum;
		}
		return result;
	}
}
