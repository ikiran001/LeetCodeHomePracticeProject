package LeetCodeArrays;
//https://leetcode.com/problems/two-sum/

import java.util.Arrays;



/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/


public class LeetCode01  {

	public static void main(String[] args) {
		int[] arr= {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(arr, 9)));
	}


	static int[] twoSum(int[] nums, int target) {
		int [] result=new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					result[0]=i;
					result[1]=j;				}
			}
		}
		return result;
	}
}
