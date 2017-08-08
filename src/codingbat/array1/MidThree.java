package codingbat.array1;

public class MidThree {
	int[] midThree(int[] nums) {
		int[] result;              // 1 2 3 4 5
		if (nums.length == 3) {    // 0 1 2 3 4
			result = nums;
		} else {
			result = new int[] {nums[(nums.length / 2) - 1],
								nums[nums.length / 2],
								nums[(nums.length / 2) + 1]};
		}
		return result;
	}
}
