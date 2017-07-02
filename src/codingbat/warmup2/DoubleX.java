package warmup2;

public class DoubleX {
    boolean doubleX(String str) {
        int xIndex = str.indexOf("x");
        if (xIndex == -1 || xIndex == str.length() - 1) return false;
        return str.substring(xIndex + 1, xIndex + 2).equals("x");
    }
}
