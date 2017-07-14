package mytestframework;

public class Asserts {
	public static void assertEquals(String actual, String expected) {
		boolean equals = actual.equals(expected);
		if (!equals) {
			System.err.println("Test failed: expected '" + expected
					+ "', but actual '" + actual + "'");
		} else {
			System.out.println("Test passed: expected '" + expected
					+ "', actual '" + actual + "'");
		}
	}
	public static void assertNotEquals(String actual, String expected) {
		boolean notEquals = !actual.equals(expected);
		if (!notEquals) {
			System.err.println("Test failed: expected NOT '" + expected
					+ "', but actual '" + actual + "'");
		} else {
			System.out.println("Test passed: expected NOT '" + expected
					+ "', actual '" + actual + "'");
		}
	}
	public static void assertEquals(int actual, int expected) {
		boolean equals = actual == expected;
		if (!equals) {
			System.err.println("Test failed: expected '" + expected
					+ "', but actual '" + actual + "'");
		} else {
			System.out.println("Test passed: expected '" + expected
					+ "', actual '" + actual);
		}	
	}
	public static void assertNotEquals(int actual, int expected) {
		boolean notEquals = actual != expected;
		if (!notEquals) {
			System.err.println("Test failed: expected NOT '" + expected
					+ "', but actual '" + actual + "'");
		} else {
			System.out.println("Test passed: expected NOT '" + expected
					+ "', actual '" + actual + "'");
		}
	}
	public static void assertEquals(boolean actual, boolean expected) {
		boolean equals = actual == expected;
		if (!equals) {
			System.err.println("Test failed: expected '" + expected
					+ "', but actual '" + actual + "'");
		} else {
			System.out.println("Test passed: expected '" + expected
					+ "', actual '" + actual);
		}
	}
	public static void assertNotEquals(boolean actual, boolean expected) {
		boolean notEquals = actual != expected;
		if (!notEquals) {
			System.err.println("Test failed: expected NOT '" + expected
					+ "', but actual '" + actual + "'");
		} else {
			System.out.println("Test passed: expected NOT '" + expected
					+ "', actual '" + actual + "'");
		}
	}
}