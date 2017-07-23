package array2;

public class Sum67 {
	int sum67(final int[] nums) {
		int result = 0;
		boolean is67 = false;
		for (final int num : nums) {
			if (!is67) {
				if (num != 6) {
					result += num;
				} else {
					is67 = !is67;
				}
			} else {
				if (num == 7) {
					is67 = !is67;
				}
			}
		}
		return result;
	}
}