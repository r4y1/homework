package homework170627;

public class Utils {
	public static String toBinaryString(int number) {
		if (number == 0) return "0";
		String result = "";
		while (number != 0) {
			int reminder = number % 2;
			number /= 2;
			result += reminder;
		}
		String reverse = new StringBuffer(result).reverse().toString();
		return reverse;
	}
	
	public static String toHexString(int number) {
		if (number == 0) return "0";
		String result = "";
		while (number != 0) {
			int reminder = number % 16;
			number /= 16;
			if (reminder > 9) {
				char c = (char) (reminder + 55);
				result += c;
				
			} else {
				result += reminder;
			}
		}
		String reverse = new StringBuffer(result).reverse().toString();
		return reverse;
	}
	
	public static String toOctalString(int number) {
		if (number == 0) return "0";
		String result = "";
		while (number != 0) {
			int reminder = number % 8;
			number /= 8;
			result += reminder;
		}
		String reverse = new StringBuffer(result).reverse().toString();
		return reverse;
	}
	
	public static String toNumeralSystem(int number, int numSystem) {
		if (numSystem > 37) return "numSystem must be in range [0, 36]";
		if (number == 0 || numSystem < 2) return "0";
		if (numSystem == 10) return Integer.toString(number);
		String result = "";
		if (numSystem < 10) {
			while (number != 0) {
				int reminder = number % numSystem;
				number /= numSystem;
				result += reminder;
			}
		} else {
			while (number != 0) {
				int reminder = number % numSystem;
				number /= numSystem;
				if (reminder > 9) {
					char c = (char) (reminder + 55);
					result += c;
				} else {
					result += reminder;
				}
				
			}
		}
		String reverse = new StringBuffer(result).reverse().toString();
		return reverse;
	}
}
