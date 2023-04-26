package LeetCodeArrays;

import java.util.Arrays;

public class LeetCode832 {

	public static void main(String[] args) {
		int[][] arr= {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		int[][] ans=flipAndInvertImage(arr);
		for (int i = 0; i <  ans.length; i++) {
			System.out.println(Arrays.toString(ans[i]));
		}
	}

	public static int[][] flipAndInvertImage(int[][] image) {
		for (int i = 0; i < image.length; i++) {
			int j=0;
			int k=image[i].length-1;
			while(j<k) {
				swap(image,i,j++,k--);
			}
		}
		return methodSwitch(image);
	}

	private static void swap( int[][] arr,int k,int i, int j) {
		int temp=arr[k][i];
		arr[k][i]=arr[k][j];
		arr[k][j]=temp;
	}

	private static int[][] methodSwitch(int [][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]==1)arr[i][j]=0;
				else arr[i][j]=1;
			}
		}
		return arr;
	}
}
