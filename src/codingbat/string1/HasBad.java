package string1;

public class HasBad {
	boolean hasBad(String str) {
		return str.indexOf("bad") == 0 || str.indexOf("bad") == 1 ? true : false;
	}
}
