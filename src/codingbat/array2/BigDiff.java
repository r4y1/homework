package array2;

public class BigDiff {
	int bigDiff(final int[] nums) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (final int num : nums) {
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		return max - min;
	}
}
