package array2;

import java.util.Arrays;

public class CenteredAverage {
	int centeredAverage(final int[] nums) {
		final int [] sortedNums = nums.clone();
		Arrays.sort(sortedNums);
		int sum = 0;
		for (int i = 1; i < sortedNums.length - 1; i++) {
			sum += sortedNums[i];
		}
		return sum / (sortedNums.length - 2);
	}
}