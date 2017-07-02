package string1;

public class StartWord {
	String startWord(String str, String word) {
		if (str.length() == 1 && word.length() == 1) return str;
		if (str.length() < 2) return "";
		if (str.substring(1, word.length()).equals(word.substring(1))) return str.substring(0, word.length());
		return "";
	}
}
