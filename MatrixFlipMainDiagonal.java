
public class MatrixFlipMainDiagonal {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, 
							{ 6, 5, 6, 7, 8 }, 
							{ 3, 6, 8, 9, 20 }, 
							{ 90, 7, 9, 10, 11 },
							{ 100, 8, 10, 11, 12 } };

		matrixFlipMainDiagonal(matrix);

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println("\n");
		}

	}

	public static void matrixFlipMainDiagonal(int[][] matrix) {
		if (matrix.length != matrix[0].length) {
			System.out.println("The matrix is unflipable");
			;
		} else {
			for (int row = 0; row < matrix.length - 1; row++) {
				for (int col = row + 1; col < matrix.length; col++) {
					int temp = matrix[row][col];
					matrix[row][col] = matrix[col][row];
					matrix[col][row] = temp;
				}
			}
		}

	}

}
