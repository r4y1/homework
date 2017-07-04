package logic1;

public class CaughtSpeeding {
	int caughtSpeeding(int speed, boolean isBirthday) {
		int result = 0;
		if (isBirthday) {
			result = speed <= 65 ? 0 : speed <= 85 ? 1 : 2;
		} else {
			result = speed <= 60 ? 0 : speed <= 80 ? 1 : 2;
		}
		return result;
	}
}
