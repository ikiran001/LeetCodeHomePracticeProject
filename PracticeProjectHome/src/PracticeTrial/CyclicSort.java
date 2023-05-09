package PracticeTrial;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		int[] arr= {9,8,7,6,5,5,5,2,1};
		cyclickSort(arr);
	}

	public static void cyclickSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int correctIndex=arr[i]-1;
			swap(arr, i, correctIndex);
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int start, int end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
}
