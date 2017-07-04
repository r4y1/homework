package logic1;

public class Love6 {
	boolean love6(int a, int b) {
		boolean result = false;
		boolean diff6 = Math.abs(a - b) == 6;
		boolean sum6 = (a + b) == 6;
		if (a == 6 || b == 6 || diff6 || sum6) {
			result = true;
		}
		return result;
	}
}
