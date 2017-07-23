package array2;

public class Sum13 {
	int sum13(final int[] nums) {
		int result = 0;
		final int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (nums[i] != 13) {
				result += nums[i];
			} else {
				if (i < len - 1) {
					i++;
				}
			}
		}
		return result;
	}
}