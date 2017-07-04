package logic1;

public class LessBy10 {
	boolean lessBy10(int a, int b, int c) {
		boolean result = false;
		if ( a - b >= 10 || a - c >= 10 || 
			 b - a >= 10 || b - c >= 10 ||
			 c - a >= 10 || c - b >= 10) {
			result = true;
		}
		return result;
	}
}
