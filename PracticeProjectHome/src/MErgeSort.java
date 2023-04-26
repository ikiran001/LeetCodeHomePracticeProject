import java.util.Arrays;

public class MErgeSort {

	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1,-33,123,3333,985,0};
		System.out.println(Arrays.toString( mergeSort(arr)));	
	}

	public static int[] mergeSort(int[] arr) {
		if(arr.length==1) {
			return arr; 
		}
		int mid=arr.length/2;
		int [] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int [] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		return merge(left	, right);
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int i = 0,j = 0,k=0;
		int[] mix=new int[arr1.length+arr2.length];

		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				mix[k]=arr1[i];
				i++;
			}
			else {
				mix[k]=arr2[j];
				j++;
			}
			k++;
		}

		while(i<arr1.length) {
			mix[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			mix[k]=arr2[j];
			j++;
			k++;

		}

		return mix;
	}

}
