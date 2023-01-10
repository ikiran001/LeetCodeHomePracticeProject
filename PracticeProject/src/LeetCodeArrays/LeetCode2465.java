package LeetCodeArrays;

import java.util.Arrays;
import java.util.HashSet;


public class LeetCode2465 {

	public static void main(String[] args) {
		int []arr= {9,5,7,8,7,9,8,2,0,7};

		System.out.println(distinctAverages(arr));
	}
	public static int distinctAverages(int[] nums) {
		HashSet<Integer> set=new HashSet<>();
		Arrays.sort(nums);
		int i=0;
		int j=nums.length-1;
		while(i<=j) {
			set.add((nums[i]+nums[j]));
			i++;
			j--;
		}
		return set.size();
	}


}
