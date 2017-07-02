package homework170627;

public class ToHexString {

	public static void main(String[] args) {
	
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toHexString(10), "A"));
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toHexString(11), "B"));

		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toHexString(12), "C"));
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toHexString(13), "D"));
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toHexString(14), "E"));

		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toHexString(15), "F"));
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toHexString(16), "10"));

		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toHexString(100), "64"));
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toHexString(200), "C8"));

		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toHexString(300), "12C"));

		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toHexString(10), "10"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toHexString(11), "11"));

		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toHexString(12), "12"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toHexString(13), "13"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toHexString(14), "4"));

		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toHexString(15), "15"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toHexString(16), "16"));
	}
	
}
