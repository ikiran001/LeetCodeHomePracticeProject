package Backtracking;

import java.util.Arrays;

public class PathArray {

	public static void main(String[] args) {
		boolean [][] arr={{true,true,true},
				{true,true,false},
				{true,true,true}};

		int[][] path =new int[arr.length-1][arr[0].length-1];

		path("", arr, path, 0, 0, 1);

	}

	public static void path(String p, boolean[][] arr, int[][] path, int c, int r , int step) {

		if(r==arr.length-1 && c==arr[0].length-1) {
			for(int[] arrr: path) {
				System.out.println(Arrays.toString(arrr));
			}
			System.out.println(p);
			System.out.println();
			return ;
		}

		if(!arr[r][c]) {
			return;
		}

		arr[r][c]=false;
		path[r][c]=step;


		if(r<arr.length-1) {
			path(p+'D', arr, path, c, r+1, step+1);
		}

		if(c<arr[0].length-1) {
			path(p+'R', arr, path, c+1, r, step+1);
		}

		if(r>0) {
			path(p+'U', arr, path, c, r-1, step+1);
		}

		if(c>0) {
			path(p+'L', arr, path, c-1, r, step+1);
		}

		arr[r][c]=true;
		path[r][c]=0;

	}

}
