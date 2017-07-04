package logic1;

public class RedTicket {
	int redTicket(int a, int b, int c) {
		int result;
		if (a == 2 && b == 2 && c == 2) {
			result = 10;
		} else if ( (a == 1 && b == 1 && c == 1) ||
				    (a == 0 && b == 0 && c == 0) ) {
			result = 5;
		} else if (b != a && c != a) {
			result = 1;
		} else {
			result = 0;
		}
		return result;
	}
}
