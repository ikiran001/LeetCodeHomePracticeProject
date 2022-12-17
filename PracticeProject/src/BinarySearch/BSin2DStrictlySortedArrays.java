package BinarySearch;

import java.util.Arrays;

public class BSin2DStrictlySortedArrays {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},
				     {4,5,6},
				     {7,8,9}};
		System.out.println(Arrays.toString(search(arr, 9)));
	}
	
	static int[] binarySearch(int[][]matrix,int target,int row,int cStart,int cEnd) {
		while(cStart<=cEnd) {
			int cMid=cStart+(cEnd-cStart)/2;
			if(matrix[row][cMid]==target) {
				return new int[] {row,cMid};
			}
			else if(target>matrix[row][cMid]) {
				cStart=cMid+1;
			}
			else {
				cEnd=cMid-1;
			}

		}
		return new int[] {-1,-1};
	}

	static int[] search(int[][] matrix, int target) {
		int row=matrix.length;
		int col=matrix[0].length;

		//if there is only one row
		if(row==1) {
			return binarySearch(matrix, target, row, 0, col-1);
		}

		//run the loop for two times
		int rStart=0;
		int rEnd=row-1;
		int cMid=col/2;
		
		//loop for the middle column
		while(rStart<(rEnd-1)) {  
			int mid=rStart+(rEnd-rStart)/2;
			if(matrix[mid][cMid]==target) {
				return new int[] {mid,cMid};
			}
			else if(matrix[mid][cMid]<target) {
				rStart=mid;
			}
			else {
				rEnd=mid;
			}
		}

		//now we have two rows
		//check weather the target is in col of rows	
		if(matrix[rStart][cMid]==target) {
			return new int[] {rStart,cMid};
		}
		else if(matrix[rStart+1][cMid]==target) {
			return new int[] {rStart+1,cMid};
		}

		//search in 1st half
		else if(target<=matrix[rStart][cMid-1]) {
			return binarySearch(matrix, target, rStart, 0, cMid-1);
		}

		//search in 2nd half
		else if(target>=matrix[rStart][cMid+1]&& target<=matrix[rStart][col-1]) {
			return binarySearch(matrix, target, rStart, cMid+1, col-1);

		}
		//search in 3rd half
		else if(target<=matrix[rStart+1][cMid-1]) {
			return binarySearch(matrix, target, rStart+1, 0, cMid-1);
		}
		//search in 4th half
		else {
			return binarySearch(matrix, target, rStart+1, cMid+1, col-1);
		}
	}
}















