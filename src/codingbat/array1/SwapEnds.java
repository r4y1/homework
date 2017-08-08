package codingbat.array1;

import java.util.Arrays;

public class SwapEnds {
	int[] swapEnds(int[] nums) {
		int[] result = Arrays.copyOf(nums, nums.length);
		if (nums.length != 1) {
			result[0] = nums[nums.length - 1];
			result[result.length - 1] = nums[0];
		}
		return result;
	}
}
