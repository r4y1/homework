package codingbat.string3;

import java.util.Arrays;

public class WithoutString {
    public String withoutString(String base, String remove) {
        String base1 = base.toLowerCase();
        String remove1 = remove.toLowerCase();
        final int baseLen = base.length();
        final int removeLen = remove.length();
        StringBuilder result = new StringBuilder();
        int[] indexes = new int[baseLen];
        for (int i = 0; i < baseLen; i++) {
            if (base1.indexOf(remove1, i) != -1) {
                for (int q = 0; q < removeLen; q++) {
                    indexes[base1.indexOf(remove1, i) + q] = 1;
                }
                i += removeLen - 1;
            }
        }
        for (int i = 0; i < indexes.length; i++) {
            if (indexes[i] == 0) {
                result.append(base.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        WithoutString ws = new WithoutString();
        System.out.println(ws.withoutString("Hello there", "ell"));
    }
}
