package array1;

public class MakeLast {
	int[] makeLast(int[] nums) {
		int[] result = new int[nums.length * 2];
		result[result.length - 1] = nums[nums.length - 1];
		for (int i = 0; i < result.length - 2; i++) {
			result[i] = 0;
		}
		return result;
	}
}
