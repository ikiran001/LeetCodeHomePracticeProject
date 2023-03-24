package LeetCodeArrays;

import java.util.Arrays;

public class LeetCode462 {

	public static void main(String[] args) {
		int[] arr= {1,0,0,8,6};
		System.out.println(minMoves2(arr));
	}

	public static int minMoves2(int[] nums) {
		Arrays.sort(nums);
		int len=nums.length;
		int ans=0;
		int med=(len%2==0) ? (nums[len/2]+nums[len/2-1])/2 : nums[len/2];
		for(int n: nums) {
			ans+=Math.abs(n-med);
		}
		return ans;
	}
}
