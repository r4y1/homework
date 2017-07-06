package logic2;

public class EvenlySpaced {
	boolean evenlySpaced(int a, int b, int c) {
		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a, b), c);
		int middle = a + b + c - min - max;
		boolean result = false;
		if (max - middle == middle - min) {
			result = true;
		}
		return result;
	}
}
