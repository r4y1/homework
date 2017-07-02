package warmup1;

public class MissingChar {
    String missingChar(String str, int n) {
        String charsBefore = str.substring(0, n);
        String charsAfter = str.substring(n + 1);
        return charsBefore + charsAfter;
    }
}
