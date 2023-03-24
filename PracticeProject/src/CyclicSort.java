import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		cycliSort(arr);
	}

	public static void cycliSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int correctInd=arr[i]-1;
			if(arr[i]!=arr[correctInd]) {
				swap(arr, i, correctInd);
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
