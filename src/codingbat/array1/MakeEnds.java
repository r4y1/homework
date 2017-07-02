package array1;

public class MakeEnds {
	int[] makeEnd(int[] nums) {
		if (nums.length == 1) {
			return new int[] {nums[0], nums[0]};
		} else {
			return new int[] {nums[0], nums[nums.length - 1]};
 		}
	}
}
