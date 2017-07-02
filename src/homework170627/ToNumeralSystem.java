package homework170627;

public class ToNumeralSystem {

	public static void main(String[] args) {
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toNumeralSystem(70, 13) , "55"));
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toNumeralSystem(80, 36) , "28"));

		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toNumeralSystem(500, 32) , "FK"));
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toNumeralSystem(11, 3) , "102"));
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toNumeralSystem(111, 20) , "5B"));
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toNumeralSystem(666, 6) , "3030"));
		
		System.out.println(
				SimpleUnit.assertEquals(
						Utils.toNumeralSystem(666, 666), "numSystem must be in range [0, 36]"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toNumeralSystem(5, 5) , "5"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toNumeralSystem(17, 17) , "17"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toNumeralSystem(20, 36) , "36"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toNumeralSystem(15, 2) , "15"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toNumeralSystem(612, 6) , "1230"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toNumeralSystem(10, 11) , "10"));
		
		System.out.println(
				SimpleUnit.assertNotEquals(
						Utils.toNumeralSystem(666, 666) , "666"));
	}
	
}