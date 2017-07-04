package logic1;

public class GreenTicket {
	int greenTicket(int a, int b, int c) {
		int result;
		if (a == b && b == c) {
			result = 20;
		} else if (a == b || b == c || a == c) {
			result = 10;
		} else {
			result = 0;
		}
		return result;
	}
}
