package array1;

public class Start1 {
	int start1(int[] a, int[] b) {
		int result;
		if (a.length != 0 && b.length != 0) {
			if (a[0] == 1 && b[0] == 1) {
				result = 2;
			} else if (a[0] == 1 || b[0] == 1) {
				result = 1;
			} else {
				result = 0;
			}
		} else if (a.length == 0 && b.length == 0) {
			result = 0;
		} else if (a.length == 0) {
			result = b[0] == 1 ? 1 : 0;
		} else {
			result = a[0] == 1 ? 1 : 0;
		}
		return result;
	}
}
