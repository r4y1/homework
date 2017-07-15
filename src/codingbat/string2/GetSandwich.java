package codingbat.string2;

public class GetSandwich {
    String getSandwich(String str) {
        String result = "";
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if (first >= 0  &&  (first >= 0  && first != last )) {
            result = str.substring(first + 5, last);
        }
        return result;
    }
}
