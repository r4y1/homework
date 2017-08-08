package codingbat.array1;

public class FrontPiece {
	int[] frontPiece(int[] nums) {
		int[] result;
		if (nums.length < 3) {
			result = nums;
		} else {
			result = new int[] {nums[0], nums[1]};
		}
		return result;
	}
}
