package logic2;

public class MakeBricks {
	boolean makeBricks(int small, int big, int goal) {
		boolean result = false;
		if (small == 0) {
			result = goal % big == 0;
		}
		if (big == 0) {
			result = goal % small == 0;
		}
		if (big != 0 && small != 0) {
			if ( (goal % big) % small == 0 || (goal % small) % big == 0 ) {
				result =  true;
			}
		} else {
			result = false;
		}
		return result;
	}
}
