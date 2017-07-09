package homework170707;

public class StringMethods{

	static String replace(String str, String target, String replacement) {
		String result;
		if (str.indexOf(target) != -1) {
			if (str.indexOf(target) == 0) {
				result = replacement + str.substring(1);
			}
			result = str.substring(0, str.indexOf(target)) + 
					replacement + 
					str.substring(str.indexOf(target) + replacement.length());
		} else {
			result = str;
		}
		return result;
	}
	
	static String trim(String str) {
		String result = str;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("test".indexOf("e"));
	}
	
	
}
