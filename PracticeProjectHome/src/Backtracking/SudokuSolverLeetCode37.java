package Backtracking;

public class SudokuSolverLeetCode37 {

	public static void main(String[] args) {


	}

	public void solveSudoku(char[][] board) {
		helper( board ,  0,0);
	}



	public boolean helper(char[][] board,int row, int col ) {

		if(row==board.length) {
			return true;
		}
		int nrow=0;
		int ncol=0;

		if(col!=board.length-1) {
			nrow=row;
			ncol=col+1;
		}
		else{
			nrow=row+1;
			ncol=0;
		}

		if(board[row][col]!='.') {

			//if number already available return true
			if(helper(board, nrow, ncol)) {
				return true;
			}
		}
		else {

			//if number is not availbale then chose 1 number from 1-9 and check whether selected number is safe r not
			for (int i = 1; i <=9; i++) {

				if(isSafe(board,row,col,i)) {
					board[row][col]=(char)(i+'0'); //if safe then ,put /// and call next cells
					if(helper(board, nrow, ncol)) {  //if number ok , then return true else remove the number and put .
						return true;
					}
					else {
						board[row][col]='.';
					}

				}
			}
		}


		return false;
	}


	//for safety check row wise and col wise number , if number is alredy present then return false 
	private boolean isSafe(char[][] board, int row, int col, int num) {

		//row and col
		for (int i = 0; i < board.length; i++) {
			if(board[i][col]==(char)(num+'0')) {
				return false;  //if number is alredy present in row , return false
			}
			if(board[row][i]==(char)(num+'0')) {
				return false;
			}
		}
		//grid
		int sr=(row/3)*3;
		int sc=(col/3)*3;

		for (int j = sr; j < sr+3; j++) {
			for (int j2 = sc; j2 < sc+3; j2++) {
				if(board[j][j2]==(char)(num+'0')) {
					return false;
				}
			}
		}
		return true;
	}

}














