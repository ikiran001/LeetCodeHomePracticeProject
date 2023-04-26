package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode64 {

	public static void main(String[] args) {
int [][] arr= {{1,3,1},{1,5,1},{4,2,1}};
System.out.println(minPathSum(arr));
	}

	public static int minPathSum(int[][] grid) {
		return helper(0, 0, grid);
	}

	
	public static int helper(int row, int col, int[][] grid) {
		int lhs=0;
		int rhs=0;
		List<Integer> list=new ArrayList<>();
		int sum=0;
		sum+=grid[row][col];
		if(row==grid.length-1 && col==grid[0].length-1) {
			list.add(lhs+rhs);
			return sum;
		}
	
		
		if(row<grid.length-1) {
			
			lhs =helper(row+1,col,grid);

		}
		if(col<grid[0].length-1) {
			col+=1;
			rhs=helper(row,col+1,grid);

		}
		
		
		return Collections.min(list);



	
	}
}
