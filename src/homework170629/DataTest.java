package homework170629;

public class DataTest {
	
	public static void main(String[] args) {
		
		DataGenerator dg = new DataGenerator();
		MatchSearcher ms = new MatchSearcher();
		byte[] testArr = dg.generate(15);
		System.out.println(new String(testArr));
		
		long startTimeLoop = System.currentTimeMillis();
		ms.loopSearcher(testArr, 3);
		long endTimeLoop = System.currentTimeMillis();
		System.out.println("Total execution time of loopSearcher " + (endTimeLoop - startTimeLoop) + "ms");
	
	}
	
}
