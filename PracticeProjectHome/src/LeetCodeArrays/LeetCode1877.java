package LeetCodeArrays;

import java.util.Arrays;

public class LeetCode1877 {

	public static void main(String[] args) {
int[] arr= {3,5,4,2,4,6};
System.out.println(minPairSum(arr));


	}
	   public static  int minPairSum(int[] nums) {
	        Arrays.sort(nums);
	        int max=0;
	        int temp;
	        int maxel;
	        int s=0;
	        int e=nums.length-1;
	        while(s<e) {
	        	temp=nums[s]+nums[e];
	        	maxel=Math.max(max, temp);
	        	if(maxel>max) {
	        		max=maxel;
	        		s++;
	        		e--;
	        	}
	        	else {
	        		s++;
	        		e--;
	        	}
	        	
	        }
	        return max;
	    }

}
