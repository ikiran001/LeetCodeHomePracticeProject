package LeetCodeArrays;
//https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;

/*Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].*/


public class LeetCode1470 {

	public static void main(String[] args) {
		int[]	nums = {2,5,1,3,4,7};

		System.out.println(Arrays.toString(shuffle(nums, 3)));
	}
	 static int[] shuffle(int[] nums, int n) {
		int [] ans=new int[nums.length];
		for(int index=0 ; index<n;index++) {
			ans[2*index]=nums[index];
			ans[2*index+1]=nums[index+n];
		}
		return ans;
	}
}
