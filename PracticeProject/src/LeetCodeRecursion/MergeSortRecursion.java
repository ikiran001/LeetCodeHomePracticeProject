package LeetCodeRecursion;

import java.util.Arrays;

public class MergeSortRecursion {

	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		arr=mergeSort(arr);
		System.out.println(Arrays.toString(arr));

	}	


	public static int[]  mergeSort(int [] nums) {
		if(nums.length==1) {
			return nums;
		}
		int mid=nums.length/2;
		int [] left= mergeSort  (Arrays.copyOfRange(nums, 0, mid));
		int [] right = mergeSort (Arrays.copyOfRange(nums, mid, nums.length));
		return  merge(left, right);
	}



	public static int [] merge(int []first, int[] second) { 
		int [] mix=new int[first.length+second.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<first.length  && j<second.length) {
			if(first[i]<second[j]) {
				mix[k]=first[i];
				i++;
			}
			else{
				mix[k]=second[j];
				j++;
			}
			k++;
		}

		while(i<first.length) {
			mix[k]=first[i];
			k++;
			i++;
		}
		while(j<second.length) {
			mix[k]=second[j];
			k++;
			j++;
		}
		return mix;

	}

}