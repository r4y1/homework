package homework170627;

public class ToBinaryStringTest {

	public static void main(String[] args) {
		
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toBinaryString(100), "1100100"));
		

		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toBinaryString(200), "11001000"));
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toBinaryString(300), "100101100"));
		
					
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toBinaryString(100), "599123"));
		

		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toBinaryString(200), "70423"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toBinaryString(300), "112231123"));
	}
}
