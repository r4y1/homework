package array2;

public class FizzArray2 {
	String[] fizzArray2(final int n) {
		final String[] array = new String[n];
		for (int i = 0; i < n; i++) {
			array[i] = String.valueOf(i);
		}
		return array;
	}
}
