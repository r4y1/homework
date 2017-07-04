package logic1;

public class WithoutDoubles {
	int withoutDoubles(int die1, int die2, boolean noDoubles) {
		int result = 0;
		if (noDoubles && die1 == die2) {
			die1++;
			if (die1 == 7) {
				die1 = 1;
			}
		}
		result = die1 + die2;
		return result;
	}
}
