package warmup1;

public class Front22 {
    String front22(String str) {
        return str.length() <= 2 ?
                str + str + str :
                str.substring(0, 2) + str + str.substring(0, 2);
    }
}
