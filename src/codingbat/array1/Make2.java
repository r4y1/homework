package array1;

public class Make2 {
	int[] make2(int[] a, int[] b) {
		int[] result;
		if (a.length == 1 && b.length == 1) {
			result = new int[] { a[0], b[0] };
		} else if (a.length == 1 && b.length == 0) {
			result = new int[] {a[0]};
		} else if (b.length == 1 && a.length == 0) {
			result = new int[] { b[0] };
		} else if (a.length == 0 ) {
			result = new int[] { b[0], b[1] };
		} else if (b.length == 0) {
			result = new int[] { a[0], a[1] };
		} else if (a.length == 1) {
			result = new int[] { a[0], b[0] };
		} else {
			result = new int[] { a[0], a[1] };
		}
		return result;
	}
}
