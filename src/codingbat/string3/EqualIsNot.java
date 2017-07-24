package codingbat.string3;

public class EqualIsNot {
    public boolean equalIsNot(String str) {
        int isCount = countIs(str);
        int notCount = countNot(str);
        boolean isEqual = isCount == notCount;
        return isEqual;

    }
    public int countIs(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
                count++;
            }
        }
        return count;
    }
    public int countNot(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'o' &&
                    str.charAt(i + 2) == 't') {
                count++;
            }
        }
        return count;
    }
}
