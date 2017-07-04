package logic1;

public class FizzString {
	String fizzString(String str) {
		String result = str;
		if (str.substring(0, 1).equals("f") && str.substring(str.length() - 1).equals("b")) {
			result = "FizzBuzz";
		} else if (str.substring(0, 1).equals("f")) {
			result = "Fizz";
		} else if (str.substring(str.length() - 1).equalsIgnoreCase("b")) {
			result = "Buzz";
		}
		return result;
	}
}
