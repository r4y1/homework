package codingbat.array1;

public class Unlucky1 {
	boolean unlucky1(int[] nums) {
		boolean result;
		int l = nums.length;
		if (l < 2) {
			result = false;
		} else if ( (nums[0] == 1 && nums[1] == 3) ||
				    (nums[l - 2] == 1 && nums[l - 1] == 3) ||
				    (nums[1] == 1 && nums[2] == 3)  ) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
