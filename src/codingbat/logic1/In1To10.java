package logic1;

public class In1To10 {
	boolean in1To10(int n, boolean outsideMode) {
		boolean result = false;
		if (outsideMode) {
			result = n <= 1 || n >= 10;
		} else {
			result = n >= 1 && n <= 10; 
		}
		return result;
	}
}
