
public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 0 }, 
				{ 4, 0, 6 } };

		int[][] matrix2 = { { 1, 2, 3, 4 }, 
				{ 5, 6, 1, 8 }, 
				{ 9, 10,11,12} };

		matrixMultiplication(matrix1, matrix2);

	}

	public static void matrixMultiplication(int[][] matrix1, int[][] matrix2) {
		int[][] matrixMult = new int [matrix1.length][matrix2[0].length];

		for (int row1 = 0; row1 < matrix1.length; row1++ ) {
			for (int col2 = 0; col2 < matrix2[0].length; col2++) {
				int sum = 0;
				for (int index = 0; index < matrix1[0].length; index++) {
					int num = matrix1[row1][index]*matrix2[index][col2];
					sum = sum+num;
				}
				matrixMult[row1][col2]=sum;
			}
		}
		
		for(int row = 0; row < matrixMult.length; row++) {
			for(int col = 0; col < matrixMult[0].length; col++) {
				System.out.print(matrixMult[row][col]+ " ");
			}
			System.out.println("\n");
		}
	}}
