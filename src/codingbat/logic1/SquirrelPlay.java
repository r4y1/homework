package logic1;

public class SquirrelPlay {
	boolean squirrelPlay(int temp, boolean isSummer) {
		boolean result = false;
		if (isSummer) {
			result = temp >= 60 && temp <= 100;
		} else {
			result = temp >= 60 && temp <= 90;
		}
		return result;
	}
}
