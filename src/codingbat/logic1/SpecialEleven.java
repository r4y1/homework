package logic1;

public class SpecialEleven {
	boolean specialEleven(int n) {
		boolean result = false;
		result = n % 11 == 0 || n % 11 == 1;
		return result;
	}
}
