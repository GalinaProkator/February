
public class MatrixSortedRecursion {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 13, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		int row = 0;
		int col = 0;

		System.out.println(isSorted(matrix, row, col));

	}

	public static boolean isSorted (int [][]matrix, int row, int col) {
		int nextRow = row;
		int nextCol = col + 1;

		if (col+1 == matrix[0].length) {
			nextRow = row+1;
			nextCol = 0;
		}

		if (nextRow == matrix.length) {
			return true;
		}

		if (matrix[row][col]>matrix[nextRow][nextCol]) {
			return false;
		}
		else {
			return isSorted(matrix, nextRow, nextCol);
		}
	}
}
