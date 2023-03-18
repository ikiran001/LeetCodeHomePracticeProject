import java.util.Arrays;

//swap the last index with the largest index
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {0,6,5,7,8,9,4,5,44,5,6,7,899,1000};
		selectionSort(arr);
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int lastindex=array.length-i-1;
			int maxIndex=getMaxIndex(array, 0, lastindex);
			swap(array, lastindex, maxIndex);
		}
		System.out.println(Arrays.toString(array));
	}

	public static int getMaxIndex(int[] arr, int start , int end) {
		int max=start;
		for (int i = 0; i <= end; i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		return max;
	}

	public static void swap(int [] arr, int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
