package logic2;

public class Blackjack {
	int blackjack(int a, int b) {
		int result;
		if (a <= 21 && b <= 21) {
			result = 21 - a < 21 - b ? a : b;
		} else if (a > 21 && b <= 21) {
			result = b;
		} else if (b > 21 && a <= 21){
			result = a;
		} else {
			result = 0;
		}
		return result;
	}
}
