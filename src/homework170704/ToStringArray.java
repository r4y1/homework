package homework170704;

public class ToStringArray {
	static String arrayToString(int[] arr) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				result += arr[i];
			} else {
				result += arr[i] + ", ";
			}
			
		}
		result = "[ " + result + " ]";
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(arrayToString(arr1));
	}
}
