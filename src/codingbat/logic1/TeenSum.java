package logic1;

public class TeenSum {
	int teenSum(int a, int b) {
		int result = a + b;
		if ( (a >= 13 && a <= 19)  || (b >= 13 && b <= 19) ) {
			result = 19;
		}
		return result;
	}
}
