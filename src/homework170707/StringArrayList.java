package homework170707;

import java.util.Arrays;

public class StringArrayList {
	
	static final int DEFAULT_SIZE = 2;
	
	String[] elements = new String[DEFAULT_SIZE];
	
	//  [a,b,c,d,e,f]
	//   0 1 2 3 4 5
	
	int size = 0;

	public void add(String string) {
		
		if (size == elements.length) {
			elements = Arrays.copyOf(elements, elements.length * 2);
		}
		
		elements[size++] = string;
//		size = size + 1;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < elements.length; i++) {
			if (i == elements.length -1 ) {
				sb.append(elements[i]);
			} else {
				sb.append(elements[i]).append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	public void remove(int i) {
		if (i >= size || i < 0) {
			return;
		}
		
		System.arraycopy(elements, i+1, elements, i, --size - i);
		elements[size] = null;
		
	}
	
	public String get(int index) {
		String result = elements[index];
		return result;
	}
	
	public void set(int index, String string) {
		elements[index] = string;
	}
	
	public int size() {
		return elements.length;
	}
	
	public boolean isEmpty() {
		return elements.length > 0;
	}
	
	public void remove(String str) {
		OUTER: for (int i = 0; i < elements.length; i++) {
			if (str.equals(elements[i])) {
				elements[i] = null;
				break OUTER;
			}
		}
	}
}