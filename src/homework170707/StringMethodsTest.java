package homework170707;

import mytestframework.*;

public class StringMethodsTest {

	public static void main(String[] args) {
		Asserts.assertEquals(StringMethods.replace("", "e", "e"), "");
		Asserts.assertEquals(StringMethods.replace("test", "e", "e"), "test");
		Asserts.assertEquals(StringMethods.replace("hello", "e", "a"), "hallo");
		Asserts.assertEquals(StringMethods.replace("test", "t", "r"), "rest");
		Asserts.assertEquals(StringMethods.replace("a", "a", "e"), "e");
		Asserts.assertNotEquals(StringMethods.replace("hello", "e", "a"), "hello");
		Asserts.assertNotEquals(StringMethods.replace("test", "t", "r"), "test");
		
		
		Asserts.assertEquals(StringMethods.trim("test"), "test");
		Asserts.assertEquals(StringMethods.trim("    test"), "test");
		Asserts.assertEquals(StringMethods.trim("test         "), "test");
		Asserts.assertEquals(StringMethods.trim("        test  "), "test");
		Asserts.assertEquals(StringMethods.trim("   te st  "), "te st");
		Asserts.assertEquals(StringMethods.trim("t e s t"), "t e s t");
		Asserts.assertEquals(StringMethods.trim("te st"), "te st");
		Asserts.assertEquals(StringMethods.trim("t es t"), "t es t");
		Asserts.assertNotEquals(StringMethods.trim("    test"), "    test");
		Asserts.assertNotEquals(StringMethods.trim("test"), "test   ");
		Asserts.assertNotEquals(StringMethods.trim("test"), "tes t   ");
		Asserts.assertNotEquals(StringMethods.trim("test"), "   t e s t    ");




		
		
		
	}
	
	
}
