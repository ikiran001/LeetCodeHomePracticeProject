package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueensLeetCode51 {

	public static void main(String[] args) {
		System.out.println(solveNQueens(10));

	}

	public static List<List<String>> solveNQueens(int n) {

		List<List<String>> Allboard=new ArrayList<>();
		char[][] board=new char[n][n];
		helper(Allboard , board , 0);
		
		return Allboard;
	}


	public static void saveBoard(List<List<String>> allBoard, char[][]board) {
		String row="";
		List<String> newBoard=new ArrayList<>();
		for (int i = 0; i < board.length; i++) {
			row="";
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]=='Q') {
					row+="Q";
				}
				else {
					row+=".";
				}
			}
			newBoard.add(row);

		}

		allBoard.add(newBoard); 
	}


	public static boolean isSafe(int row, int col, char[][]board) {
		//horizontal
		for (int j = 0; j < board.length; j++) {  //row will be constant
			if(board[row][j]=='Q') {
				return false;
			}
		}

		//vertical
		for (int i = 0; i < board.length; i++) { //col will be constant
			if(board[i][col]=='Q') {
				return false;
			}
		}

		//upper left
		int r=row;
		for (int c=col; c>=0 && r>=0 ; r--,c--) {   //r--, c--
			if(board[r][c]=='Q') {
				return false;
			}
		}
		//upper right
		r=row;
		for (int c = col; c < board.length && r>=0; r--,c++) {
			if(board[r][c]=='Q') {
				return false;
			}		
		}

		///lower left
		r=row;
		for (int c = col; c>=0 && r<board.length; c--,r++) {
			if(board[r][c]=='Q') {
				return false;
			}
		}

		//lower right
		r=row;
		for (int c = col; c < board.length  && r<board.length; c++,r++) {    
			if(board[r][c]=='Q') {
				return false;
			}
		}
		return true;

	}



	public static void helper(List<List<String>> Allboard, char[][] board, int col) {
		if(col==board.length) {
			saveBoard(Allboard,board); // change char 2D to String using i and j  , if board[i][j]=Q thennadd it to row+=Q   , then add it to newboadrd<String >, then add thius newBorad to allboard
			return;
		}

		for (int row = 0; row < board.length; row++) {
			if(isSafe(row,col,board)) {
				board[row][col]='Q';  //board[row][col] is safe then add Q
				helper(Allboard, board, col+1);   // then place queen in next colum (to check next queen safe postion)
				board[row][col]='.'; // if wromg postion of queen then make that Q to .
				
				

			}
		}
	}

}
