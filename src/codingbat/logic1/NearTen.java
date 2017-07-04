package logic1;

public class NearTen {
	boolean nearTen(int num) {
		boolean result = false;
		if ( num % 10 == 0 || 
			((num + 2) % 10) == 0 || 
			((num - 2) % 10) == 0 || 
			((num + 1) % 10 == 0) || 
			((num - 1) % 10 == 0) ) {
			result = true;
		}
		return result;
	}
}
