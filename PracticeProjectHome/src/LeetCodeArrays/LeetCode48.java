package LeetCodeArrays;

import java.util.*;

public class LeetCode48 {

	public static void main(String[] args) {
		int[][] arrr= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		rotate(arrr);
	}

	public static void rotate(int[][] matrix) {
		List<Integer> list=new ArrayList<>();
		for (int j = 0; j < matrix.length; j++) {
			for (int i = matrix.length-1; i >=0; i--) {
				list.add(matrix[i][j]);
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		int k=0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j]=list.get(k);
				k++;
			}
		}
		System.out.println(matrix.toString());
	

	}

}
