package warmup1;

public class BackAround {

    String backAround(String str) {
       String lastChar = str.substring(str.length() - 1);
       String newString = lastChar + str + lastChar;
       return newString;
    }

}
