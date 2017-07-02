package homework170624;


public class IsFibonacciTest {

    public static void main(String[] args) {
    	
    
    	System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(1), true));
    	System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(13), true));
    	System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(14), false));
    	System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(Integer.MAX_VALUE), false));

    	System.out.println(SimpleUnit.assertNotEquals(MathUtils.isFibonacci(133), true));
    	System.out.println(SimpleUnit.assertNotEquals(MathUtils.isFibonacci(Integer.MAX_VALUE), false));
    	System.out.println(SimpleUnit.assertNotEquals(MathUtils.isFibonacci(Integer.MAX_VALUE), false));
    	
    }

}
