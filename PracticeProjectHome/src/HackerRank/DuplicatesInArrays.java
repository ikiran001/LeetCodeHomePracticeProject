package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;


public class DuplicatesInArrays {

	public static void main(String[] args) {
		int [] arr= {1,1,2,3};
		duplicates(arr, 4);
	}

	public static ArrayList<Integer> duplicates(int arr[], int n) {
		ArrayList<Integer> list=new ArrayList<>();
		Arrays.sort(arr);

		for (int i=0; i<arr.length;i++){
			if(arr[i]!=i+1){
				list.add(arr[i]);
				
			} 
				else {
					i++;
				}

		}
		if(list.size()==0) {

			list.add(-1);
			return list;
		}
		else	return list;

	}

	public static void cyclicSort(int [] nums) {
		int i=0;
		while(i<nums.length) {
			int correct=nums[i]-1;
			if(nums[i]!=nums[correct]) {
				swap(nums,i,correct);
			}
			else {
				i++;
			}
		}
	}	
	static void swap(int[] nums, int first, int second) {
		int temp=nums[first];
		nums[first]=nums[second];
		nums[second]=temp;

	}
}
