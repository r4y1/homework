package codingbat.array1;

public class MakeMiddle {
	int[] makeMiddle(int[] nums) {
		int[] result;
		if (nums.length == 2) {
			result = nums;
		} else {
			result = new int[] {nums[(nums.length / 2) - 1], nums[nums.length / 2]};
		}
		return result;
	}
}
