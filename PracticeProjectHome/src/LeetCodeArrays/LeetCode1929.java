package LeetCodeArrays;

import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/

//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]

public class LeetCode1929 {

	public static void main(String[] args) {
		int[]	nums = {1,2,1};
	System.out.println(	Arrays.toString(nums));

		System.out.println(Arrays.toString(getConcatenation(nums)));
	}
	static int[] getConcatenation(int[] nums) {
		int[] ans=new int [2*nums.length]; // ans arrays length is twice of the given array

		for (int i=0;i<nums.length;i++) {
			ans[i]=nums[i];
			ans[i+nums.length]=nums[i];
		} 
		return ans;
	}


}
