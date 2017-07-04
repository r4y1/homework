package logic1;

public class InOrder {
	boolean inOrder(int a, int b, int c, boolean bOk) {
		boolean result = false;
		if (bOk) {
			result = c > b;
		} else {
			result = b > a && c > b;
		}
		return result;
	}
}
