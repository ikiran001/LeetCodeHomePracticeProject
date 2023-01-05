package LeetCodeArrays;


import java.util.Arrays;


public class SortbyPairity {

	public static void main(String[] args) {
		int []arr= {4,3,2,5};
		int [] ans=sortArrayByParityII(arr);
		System.out.println(Arrays.toString(ans));

	}

	public static int[] sortArrayByParityII(int[] nums) {
        
		int even=0;
		int odd=1;
		int[] result=new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2==0) {
				result[even]=nums[i];
				even+=2;
			}
			else {
				result[odd]=nums[i];
				odd+=2;			}
		}
		return result;
	
        
    }}

