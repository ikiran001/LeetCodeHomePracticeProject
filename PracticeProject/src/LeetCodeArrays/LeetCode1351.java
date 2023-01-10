package LeetCodeArrays;

import java.util.Collections;

public class LeetCode1351 {

	public static void main(String[] args) {


	}
	public int countNegatives(int[][] grid) {

		int neg=0;
		for(int i=0; i<grid.length;i++){
			for (int j = 0; j < grid[i].length; j++) {
             if(grid[i][j]<0) {
            	 neg++;
             }
			}
		}
		return neg;
	}
}