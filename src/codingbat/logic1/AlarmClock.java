package logic1;

public class AlarmClock {
	String alarmClock(int day, boolean vacation) {
		String result = "";
		if (vacation) {
			result = day == 0 || day == 6 ? "off" : "10:00";
		} else {
			result = day == 0 || day == 6 ? "10:00" : "7:00";
		}
		return result;
	}
}
