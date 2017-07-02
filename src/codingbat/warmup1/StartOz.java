package warmup1;

public class StartOz {
    String startOz(String str) {
        if ( str.length() > 1 && str.charAt(0) == 'o' && str.charAt(1) == 'z' ) {
            return "oz";
        } else if (str.length() > 0 && str.charAt(0) == 'o') {
            return "o";
        } else if (str.length() > 0 && str.charAt(1) == 'z') {
            return "z";
        } else return "";
    }
}
