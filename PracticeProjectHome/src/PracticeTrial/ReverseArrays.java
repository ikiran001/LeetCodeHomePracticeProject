package PracticeTrial;

import java.util.Arrays;

public class ReverseArrays {

	public static void main(String[] args) {

		int[] arr= {1,2,4,4,5,5,6,6,7,7,11,8,4};
		reverse(arr);
	}

	public static void reverse(int [] arr) {
		int start=0;
		int end =arr.length-1;
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int start, int end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}

}
