package logic1;

public class Less20 {
	boolean less20(int n) {
		boolean result = false;
		if ( (n + 1) % 20 == 0 || (n + 2) % 20 == 0 ){
			result = true;
		}
		return result;
	}
}
