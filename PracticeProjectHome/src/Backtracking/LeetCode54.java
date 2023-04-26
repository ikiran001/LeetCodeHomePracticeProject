package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class LeetCode54 {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(path(matrix, 0, 0,0));
	}

	public static List<Integer> path(int [][]matrix, int r, int c, int afn){

		if(r==matrix.length-1/2 && c==matrix[0].length-1/2) {
			List<Integer> list=new ArrayList<>();
			list.add(afn);
			return list;

		}
		
		
		
		List<Integer> ans=new ArrayList<>();
		if(matrix[r][c]==0) {
			return ans;
		}
		if(c<matrix[r][matrix[0].length-1]) {
			ans.addAll(path(matrix, r, c+1 , matrix[r][c]));
		}
		matrix[r][c]=0;

		if(r<matrix[matrix.length-1][c]) {
			ans.addAll(path(matrix, r+1, c, matrix[r][c]));
		}
		matrix[r][c]=0;

		if(c>0) {
			ans.addAll(path(matrix, r, c-1, matrix[r][c]));
		}
		matrix[r][c]=0;
		if(r>0) {
			ans.addAll(path(matrix, r-1, c, matrix[r][c]));
		}
		matrix[r][c]=0;

		return ans;
	}


}
