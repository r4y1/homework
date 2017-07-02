package homework170624;

public class ModTest {

    public static void main(String[] args) {


        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(3, 2), 1));
        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(8, 6), 2));
        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(8, 5), 3));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.mod(3, 2), 2));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.mod(8, 6), 3));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.mod(9, 3), 1));

        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(-3, -2), -1));
        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(-8, -6), -2));
        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(-8,- 5), -3));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.mod(-3, -2), -2));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.mod(-8, -6), -3));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.mod(-9, -3), -1));
    }

}
