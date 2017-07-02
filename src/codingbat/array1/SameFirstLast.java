package array1;

public class SameFirstLast {
	boolean sameFirstLast(int[] nums) {
		if (nums.length == 0) {
			return false;
		}
		if (nums.length == 1) {
			return true;
		}
		return nums[0] == nums[nums.length - 1];
	}
}
