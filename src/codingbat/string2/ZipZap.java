package codingbat.string2;

public class ZipZap {
    String zipZap(String str) {
        int i = 0;
        StringBuilder result = new StringBuilder(str.length());
        while(i < str.length()) {
            char ch = str.charAt(i);
            if(ch == 'z' && i < str.length() - 2 && str.charAt(i+2) == 'p') {
                result.append("zp");
                i += 3;
            }
            else {
                result.append(ch);
                i++;
            }
        }
        return result.toString();
    }
}
