package LeetCodeArrays;

import java.util.Arrays;

public class LeetCode26 {

	public static void main(String[] args) {
		int[] arr= {0,0,1,1,2,2,2,3,3,4};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static int cyclicSort(int [] nums) {
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
		return nums.length;
	}	
	static void swap(int[] nums, int first, int second) {
		int temp=nums[first];
		nums[first]=nums[second];
		nums[second]=temp;

	}

}
