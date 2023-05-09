package LeetCodeRecursion;
import java.util.Arrays;

public class RecursionBubbleSort {

	public static void main(String[] args) {

		int[]arr= {7,5,6 ,7,3,4,1,2,2};
		bubbleSort(arr, arr.length-1, 0);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int [] arr , int row, int col) {
		if(row==0) {
			return;
		}
		if(col<row) {
			if(arr[col]>arr[col+1]) {
				swap(arr, col+1, col);  
			}
			bubbleSort(arr, row, col+1);
		}
		else {
			bubbleSort(arr, row-1, 0); //new iteration should start with row-1 and column ==0
		}
	}



	public static void swap(int [] arr , int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}


}
