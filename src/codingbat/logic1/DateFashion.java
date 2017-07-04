package logic1;

public class DateFashion {
	int dateFashion(int you, int date) {
		int result = 0;
		if (you < 3 || date < 3) {
			result = 0;
		} else if (you > 7 || date > 7) {
			result = 2;
		} else {
			result = 1;
		}
		return result;
	}
}
