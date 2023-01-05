package LeetCodeArrays;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/
/*Input: nums = [1,2,3,4]
Output: [1,3,6,10]*/

//ans =={1,{1+2} , {1+2+3} , {1+2+3+4}}


public class LeetCode1480 {

	public static void main(String[] args) {
int[] nums = {1,2,3,4};
System.out.println(Arrays.toString(runningSum(nums)));

	}

	static int[] runningSum(int[] nums) {
		int[] ans=new int[nums.length];
		ans[0]=nums[0];
		for(int i=1;i<nums.length;i++) {
			
			ans[i]=ans[i-1]+nums[i];
			
		}
		return ans;

	}

	/*
	 * static int checkForZero( int[] nums) {
	 * 
	 * for(int i=0;i<nums.length;i++) { if(i-1==-1) { return 0; } return i-1; }
	 * return ;
	 * 
	 * }
	 */
}




