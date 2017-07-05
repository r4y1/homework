package homework170701;

public class MatrixUtils {
	void printMatrixNumbers(int[][] matrix) {
		OUTER: for (int i = 0; i < matrix.length; i++) {
			int[] row = matrix[i];
			int currentSum = 0;
			for (int j = 0; j < row.length; j++) {
				if (row[j] < 0) {
					continue OUTER;
				}
				currentSum += row[j]; 
			}
			System.out.println("Current row = " + i + ", sum of all elements = " + currentSum);
		} 
	}
	
	public static void main(String[] args) {
		int[][] matrix1 = {
				{ 0, 1, 2},
				{ 3, 4, 5},
				{ 6, 7, 8, 9}
		};
		int[][] matrix2 = {
				{ -1, 2, 100} ,
				{ 10, 20, 50 },
				{ 1, -2, 0, 1023}
		};
		
		MatrixUtils mu = new MatrixUtils();
		mu.printMatrixNumbers(matrix1);
		mu.printMatrixNumbers(matrix2);
	}
}
