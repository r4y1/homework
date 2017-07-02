package homework170627;

public class ToOctalString {

	public static void main(String[] args) {
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toOctalString(100), "144"));
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toOctalString(200), "310"));
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toOctalString(300), "454"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toOctalString(100), "100"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toOctalString(200), "200"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toOctalString(300), "300"));
	}
	
}
