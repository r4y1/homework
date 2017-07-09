package homework170707;

import mytestframework.*;

public class StringMethodsTest {

	public static void main(String[] args) {
		Asserts.assertEquals(StringMethods.replace("", "e", "e"), "");
		Asserts.assertEquals(StringMethods.replace("test", "e", "e"), "test");
		Asserts.assertEquals(StringMethods.replace("hello", "e", "a"), "hallo");
		Asserts.assertEquals(StringMethods.replace("test", "t", "r"), "rest");
	}
	
	
}
