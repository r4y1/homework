package homework170629;

import java.util.Random;

public class DataGenerator {
	
	public static final byte[] ALPHABET = {'A', 'C', 'G', 'T' };
	
	public byte[] generate(int size) {
		Random random = new Random();
		byte[] data = new byte[size];
		for (int i = 0; i < size; i++) {
			data[i] = ALPHABET[random.nextInt(3)];
		}
		return data;
	}
}
