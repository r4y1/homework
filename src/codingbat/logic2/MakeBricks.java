package logic2;

public class MakeBricks {
	boolean makeBricks(int small, int big, int goal) {
		boolean result = true;
		if (goal > big * 5 + small) {
			result = false;
		}
		if(goal % 5 > small) {
			result = false;
		} 
		return result;
	}
}
