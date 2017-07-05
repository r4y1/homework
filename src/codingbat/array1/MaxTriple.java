package array1;

public class MaxTriple {
	int maxTriple(int[] nums) {
		int result;
		if (nums.length == 1) {
			result = nums[0];
		} else {
			int first = nums[0];
			int middle = nums[nums.length / 2];
			int last = nums[nums.length - 1];
			if (first > middle && first > last) {
				result = first;
			} else if (middle > first && middle > last) {
				result = middle;
			} else {
				result = last;
			}
		}
		return result;
	}
}
