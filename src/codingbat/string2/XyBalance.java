package codingbat.string2;

public class XyBalance {

	boolean xyBalance(String str) {
		boolean isXyBalanced = false;
		int lastXindex = str.lastIndexOf('x');
		if (str.indexOf('x') < 0) {
			isXyBalanced = true;
		}
		for (int i = lastXindex + 1; i < str.length(); i++) {
			if (str.charAt(i) == 'y') {
				isXyBalanced = true;
			}
		}
		return isXyBalanced;
	}
}
