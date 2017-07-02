package array1;

public class MaxEnd3 {
	int[] maxEnd3(int[] nums) {
		int max = nums[0] > nums[nums.length - 1] ? nums[0] : nums[nums.length - 1];
		return new int[] {max, max, max};
	}
}
