package array2;

public class More14 {
	boolean more14(final int[] nums) {
		int count1 = 0;
		int count4 = 0;
		for (final int number : nums) {
			if (number == 1) {
				count1++;
			}
			if (number == 4) {
				count4++;
			}
		}
		final boolean is1MoreThen4 = count1 > count4;
		return is1MoreThen4;
	}
}
