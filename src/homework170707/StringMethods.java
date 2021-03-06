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
		String result;
		int head = 0;
		int tail= str.length();
		char[] buff = str.toCharArray();
		while (head < str.length() && buff[head] <= ' ') {
			head++;
		}
        while ((head < tail) && (buff[tail - 1] <= ' ')) {
            tail--;
        }
        if (head > 0 || tail < str.length()) {
        	result = str.substring(head, tail);
        } else {
        	result = str;
        }
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("test".indexOf("e"));
	}
	
	
}
