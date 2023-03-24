import java.util.Arrays;
import java.util.Iterator;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr= {5,4,3,2,1};
		
		bubbleSort(arr);
	}


	public static void bubbleSort(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					swap(arr, j, j-1);
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}


	public static void swap(int [] arr, int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;

	}
}
