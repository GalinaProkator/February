import java.util.Random;

import javax.swing.JOptionPane;

public class GameXO {
	enum Player{PLAYER1, PLAYER2};

	public static void main(String[] args) {
		char [][] board = new char [3][3];

		//		creating board
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				board[row][col] = '_';
			}
		}

		//		setting initial data
		int amountOfFreeCells = 9;
		char player1 = 'x';
		char player2 = 'o';

		JOptionPane.showMessageDialog(null, "The Player1 playing 'x', the Player2 playing 'o'");

		//		begin the game
		JOptionPane.showMessageDialog(null, "Let the game begin!");
		Player currentPlayer = Player.PLAYER1;

		while (amountOfFreeCells > 0 && !isWin(board)) {
			if (currentPlayer == Player.PLAYER1) {
				makeMovePlayer(player1, board, amountOfFreeCells, currentPlayer);
			}
			else {
				makeMovePlayer(player2, board, amountOfFreeCells, currentPlayer);
			}
		}

		if (amountOfFreeCells == 0) {
			JOptionPane.showMessageDialog(null, "It's a draw. Good luck next time");
		}

	}

	//	all the activity while and after the player making a move
	public static void makeMovePlayer(char player, char[][] board, int amountOfFreeCells, Player currentPlayer) {
		JOptionPane.showMessageDialog(null, "Get Ready, " + currentPlayer);
		makeMove(player, board);
		amountOfFreeCells--;
		showBoard(board);
		if (isWin(board)) {
			JOptionPane.showMessageDialog(null, "Gongratulations " + currentPlayer +"! YOU WON!");
		}
		currentPlayer = Player.PLAYER2;		
	}

	//	check if the cell is already taken
	public static void makeMove(char player, char[][] board) {
		int row = getRowValid();
		int col = getColValid();		

		while (board[row][col] != '_') {
			JOptionPane.showMessageDialog(null, "The cell is already taken. Please‬‬ ‫‪re-enter‬‬ ‫‪the row");
			row = getRowValid();
			JOptionPane.showMessageDialog(null, "The cell is already taken. Please‬‬ ‫‪re-enter‬‬ ‫‪the column");
			col = getColValid();			
		}
		board[row][col] = player;
	}

	//	creating two separate methods for row and column because of different messages for the players
	public static int getRowValid() {
		String strUserNum = JOptionPane.showInputDialog("Please enter the row number of your next move");
		int row = Integer.parseInt(strUserNum);

		while (row >= 3 && row < 0) {
			System.out.print("The row may not be more than 3");
			strUserNum = JOptionPane.showInputDialog("Please‬‬ ‫‪re-enter‬‬ ‫‪the row");
			row = Integer.parseInt(strUserNum);
		}
		return row;
	}

	public static int getColValid() {
		String strUserNum = JOptionPane.showInputDialog("Please enter the column number of your next move");
		int col = Integer.parseInt(strUserNum);

		while (col >= 3 && col < 0) {
			System.out.print("The column may not be more than 3");
			strUserNum = JOptionPane.showInputDialog("Please‬‬ ‫‪re-enter‬‬ ‫‪the column");
			col = Integer.parseInt(strUserNum);
		}
		return col;
	}

	//	printing the board
	public static void showBoard(char[][] board) {
		System.out.println("\n");
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				System.out.print(board[row][col]+" ");
			}
			System.out.println("\n");
		}
	}

	//	check if we have a win
	public static boolean isWin (char[][] board) {
		if (board[0][0] != '_') {
			if (board[0][0] == board[0][1] && board[0][0] == board[0][2]) {
				return true;
			}
			if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
				return true;
			}
			if (board[0][0] == board[1][0] && board[0][0] == board[2][0]) {
				return true;
			}
		}
		if (board[0][2] != '_') {
			if (board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
				return true;
			}
			if (board[0][2] == board[1][2] && board[0][2] == board[2][2]) {
				return true;
			}
		}
		if (board[1][1] != '_') {
			if (board[1][1] == board[1][0] && board[1][1] == board[1][2]) {
				return true;
			}
			if (board[1][1] == board[0][1] && board[1][1] == board[2][1]) {
				return true;
			}
		}
		if (board[2][0] != '_' && 
				board[2][0] == board[2][1] && board[2][0] == board[2][2]) {
			return true;
		}
		return false;
	}


}
