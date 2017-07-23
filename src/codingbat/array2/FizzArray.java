package array2;

public class FizzArray {
	int[] fizzArray(final int n) {
		final int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = i;
		}
		return array;
	}
}
