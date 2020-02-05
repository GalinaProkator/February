
public class MazeRecurcionChallengeQuestion {
	

	public static void main(String[] args) {
		int[][] matrix =  { { 1,2,3,4,5 },
							{ 1,2,3,4,5 },
							{ 1,2,3,4,5 },
							{ 1,2,3,4,5 },
							{ 1,2,3,4,5 }};
		
//		int[][] matrix =  { { 1,2 },
//							{ 3,4 }};
//		
		boolean [][] matrixBoolean = new boolean[matrix.length][matrix[0].length];
		int pathSum = 0;
		
		mazePathSumFinder(0, 0, matrix, matrixBoolean, pathSum);
		}
	
	public static void mazePathSumFinder(int row, int col, int[][]matrix, boolean[][] matrixBoolean, int pathSum) {
		
		if (row < 0 || col < 0 || row == matrix.length || col == matrix[0].length || matrixBoolean[row][col]) {
			return;
		}
		if (row == matrix.length -1 && col == matrix[0].length - 1){
			pathSum = pathSum + matrix[row][col];
			System.out.println(pathSum);
			return;
		}
		pathSum = pathSum + matrix[row][col];
		
		matrixBoolean[row][col] = true;
		mazePathSumFinder(row, col+1, matrix, matrixBoolean, pathSum);
		mazePathSumFinder(row+1, col, matrix, matrixBoolean, pathSum);
		mazePathSumFinder(row, col-1, matrix, matrixBoolean, pathSum);
		mazePathSumFinder(row-1, col, matrix, matrixBoolean, pathSum);
		matrixBoolean[row][col] = false;
	}

}
