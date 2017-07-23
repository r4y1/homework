package array2;

public class Sum28 {
	boolean sum28(final int[] nums) {
		int sum = 0;
		for (final int number : nums) {
			if (number == 2) {
				sum += number;
			}
		}
		final boolean isSum8 = sum == 8;
		return isSum8;
	}
}
