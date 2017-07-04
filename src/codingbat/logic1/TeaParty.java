package logic1;

public class TeaParty {
	int teaParty(int tea, int candy) {
		int result = 0;
		if (tea >= 5 && candy >= 5) {
			if (tea / candy >= 2 || candy / tea >= 2) {
				result = 2;
			} else {
				result = 1;
			}
		}
		return result;
	}
}
