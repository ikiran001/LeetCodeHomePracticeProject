package LeetCodeRecursion;

import java.util.Arrays;

public class RecursionSelectionSort {

	public static void main(String[] args) {
		int [] arr={5,4,2,2,1};
		selectionSort(arr, arr.length, 0, 0);
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int [] arr, int r, int c, int max) {

		if(r==0) {
			return;
		}
		if(c<r) {
			if(arr[c]>arr[max]) {
				selectionSort(arr, r, c+1, c);  //c is max,  then pass c 
			}
			else {
				selectionSort(arr, r, c+1, max); // if not max is max element
			}
		}
		else {  //when found max element , swap it with last index element which is length -1
			swap(arr, r-1, max);
			selectionSort(arr, r-1	, 0, 0); // call function with decreasing last index 
		}
	}



	public static void swap(int [] arr , int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}


}
