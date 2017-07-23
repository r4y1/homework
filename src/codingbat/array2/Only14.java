package array2;

public class Only14 {
	boolean only14(final int[] nums) {
		boolean is1or4 = true;
		for (final int number : nums) {
			if (number != 1 && number != 4) {
				is1or4 = false;
				break;
			}
		}
		return is1or4;
	}
}
