package LeetCodeArrays;

import java.util.Arrays;

public class LeetCode283 {

	public static void main(String[] args) {
		int[] arr= {0};
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));

	}

	public  static void moveZeroes(int[] nums) {


		int n=nums.length-1;
		Arrays.sort(nums);
		int j=0;
		while(j<=n) {
			if(nums[j]==0) {
				swap(nums, j, n);
			}
			n--;
			j++;
		}
		int	index=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) {
				index=i-1;
				break;
			}
		}
		int i=0;
		while(i<=index) {
			swap(nums, i, index);
			index--;
			i++;
		}

	}

	private static void swap(int[] nums, int i, int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;

	}

}
