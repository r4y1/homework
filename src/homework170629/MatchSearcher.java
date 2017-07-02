package homework170629;

import java.util.Arrays;

public class MatchSearcher {
	
	public int loopSearcher(byte[] data, int len) {
		System.out.println("loopSearcher:");
		int count = 0;
		for (int i = 0; i < data.length - len - 1; i++) {
			INNER: for (int j = i + 1; j < data.length - len; j++) {
				for (int x = 0; x < len; x++) {
					if (data[i + x] != data[j + x]) {
						continue INNER;
					}
				}
				System.out.println(new String(Arrays.copyOfRange(data, i, i + len)));
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No matches found.");
		} else {
			System.out.println("Count = " + count);
		}
		return count;
	}

}
