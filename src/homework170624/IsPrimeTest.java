package homework170624;

public class IsPrimeTest {

    public static void main(String[] args) {


        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(2), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(3), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(5), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(7), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(11), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(-1), false));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(4), false));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(6), false));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(10), false));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(14), false));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(22), false));

    }

}
