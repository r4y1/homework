package array1;

public class BiggerTwo {
	int[] biggerTwo(int[] a, int[] b) {
		int[] result;
		if (a[0] + a[1] == b[0] + b[1]) {
			result = a;
		} else if (a[0] + a[1] > b[0] + b[1]) {
			result = a;
		} else {
			result = b;
		}
		return result;
 	}
}
