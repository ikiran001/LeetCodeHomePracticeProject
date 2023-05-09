package LeetCodeArrays;

import java.util.Arrays;


public class LeetCode747 {

	public static void main(String[] args) {
		//		int[] arr= {3,6,1,0};
		//		System.out.println(dominantIndex(arr));
		System.out.println(divide(-2147483648, -1));


	}
	public static int dominantIndex(int[] nums) {
		int [] arr=Arrays.copyOf(nums, nums.length);
		Arrays.sort(nums);
		if(nums[nums.length-1]>=nums[nums.length-2]*2){
			for(int i=0; i<arr.length;i++){
				if(nums[nums.length-1]==arr[i]){
					return i;
				}
			}
		}
		return -1;
	}


	public static int divide(int dividend, int divisor) {

		if(dividend<-2147483647 && divisor <-2147483647) {
			dividend+=1;
			divisor+=1;
			return dividend/divisor;
		}


		if(dividend<-2147483647 && divisor <0) {
			dividend+=1;
			return dividend/divisor;
		}

		return dividend/divisor;

	}
}
