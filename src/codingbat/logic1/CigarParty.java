package logic1;

public class CigarParty {
	boolean cigarParty(int cigars, boolean isWeekend) {
		boolean result = false;
		if (isWeekend) {
			result = cigars >= 40;
		} else {
			result = cigars >= 40 && cigars <= 60;
		}
		return result;
	}
}
