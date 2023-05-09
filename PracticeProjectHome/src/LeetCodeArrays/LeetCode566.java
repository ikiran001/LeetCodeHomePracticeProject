package LeetCodeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode566 {

	public static void main(String[] args) {
		int[][] mat= {{1,2},{3,4}};
	System.out.println( Arrays.toString(matrixReshape(mat, 1, 4)));
		System.out.println(matrixReshape(mat, 1, 4));

	}

	public static int[][] matrixReshape(int[][] mat, int r, int c) {

		List<Integer> list=new ArrayList<>();
	
		
		int[][] ans=new int[r][c];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				list.add(mat[i][j]);
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < r; j++) {
				for (int j2 = 0; j2 < c; j2++) {
					ans[j][j2]=list.get(j2);
				}
			}
		}
		return ans;
	}

}
