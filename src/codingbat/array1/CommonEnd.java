package codingbat.array1;

public class CommonEnd {
	boolean commonEnd(int[] a, int[] b) {
		if (a.length == 0 || b.length == 0) {
			return false;
		}
		if (a.length == 1 && a[0] == b[0]) {
			return true;
		}
		if (b.length == 1 && a[0] == b[0]) {
			return true;
		}
		return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
	}
}
