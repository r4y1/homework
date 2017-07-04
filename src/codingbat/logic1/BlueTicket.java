package logic1;

public class BlueTicket {
	int blueTicket(int a, int b, int c) {
		int result;
		int ab = a + b;
		int bc = b + c;
		int ac = a + c;
		if ( ab == 10 || bc == 10 || ac == 10) {
			result = 10;
		} else if ( ab - bc == 10 || ab - ac == 10) {
			result = 5;
		} else {
			result = 0;
		}
		return result;
	}
}
