package logic1;

public class More20 {
	boolean more20(int n) {
		boolean result = false;
		int mod20 = n % 20;
		if (mod20 - 1 == 0 || mod20 - 2 == 0) {
			result = true;
		}	
		return result;
	}
}
