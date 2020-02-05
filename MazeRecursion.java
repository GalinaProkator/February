
public class MazeRecursion {

	public static void main(String[] args) {
		boolean[][] matrix = { { true, false, false, false, false },
								{ true, true, false, false, false },
								{ false, true, true, false, false },
								{ false, false, true, false, false },
								{ false, false, true, true, true }};
		
		mazePathFinder(0, 0, matrix);
		}
	
	public static void mazePathFinder(int row, int col, boolean[][] matrix) {
		if (row < 0 || col < 0 || row == matrix.length || col == matrix[0].length || !matrix[row][col]) {
			return;
		}
		if (row == matrix.length -1 && col == matrix[0].length - 1){
			System.out.println("["+row+"] ["+col+"]");
			return;
		}
		System.out.println("["+row+"] ["+col+"]");
		matrix[row][col] = false;
		mazePathFinder(row, col+1, matrix);
		mazePathFinder(row+1, col, matrix);
		mazePathFinder(row, col-1, matrix);
		mazePathFinder(row-1, col, matrix);
		matrix[row][col] = true;
	}

}
