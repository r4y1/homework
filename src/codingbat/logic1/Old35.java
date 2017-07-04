package logic1;

public class Old35 {
	boolean old35(int n) {
		boolean result = false;
		if (n % 15 == 0) {
			result = false;
		} else if (n % 3 == 0 || n % 5 == 0) {
			result = true;
		}
		return result;
	}
}
