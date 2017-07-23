package array2;

public class CountEvens {
	int countEvens(final int[] nums) {
		int count = 0;
		for (final int num : nums) {
			if (num % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}
