package codingbat.string2;

public class CatDog {
	boolean catDog(String str) {
		int cat = 0;
		int dog = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				cat++;
			}
			if (str.substring(i, i + 3).equals("dog")) {
				dog++;
			}
		}
		boolean result = cat == dog;
		return result;
	}
}
