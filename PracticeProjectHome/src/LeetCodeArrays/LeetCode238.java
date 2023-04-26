package LeetCodeArrays;

import java.util.Arrays;

public class LeetCode238 {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4};

		System.out.println( Arrays.toString(productExceptSelf2(arr)));


	}
	public static int[] productExceptSelf(int[] nums) {
	
		int [] ans=new int[nums.length];
		for (int i = 0; i < ans.length; i++) {
			ans[i]=1;
		}

		for (int i = 0; i < nums.length; i++) {
			int j=0;
			while(j<nums.length) {
				if(i!=j) {
					ans[i]*=nums[j];
					j++;
				}
				else {
					j++;
				}
			}
		}
		return ans;
	}
	
	
	 public static int[] productExceptSelf2(int[] nums) {
	        //get left multi
	        int length = nums.length;
	        int[] leftToI = new int[length];
	        int[] rightToI = new int[length];
	        int[] result = new int[length];
	        leftToI[0] = 1;
	        rightToI[length - 1] = 1;
	        
	        for (int i = 1; i < length; i++) {
	            leftToI[i] = leftToI[i - 1] * nums[i - 1];
	        }
	        
	        //get right multi
	        
	        for (int i = length - 2; i >= 0; i--) {
	            rightToI[i] = rightToI[i + 1] * nums[i+1];
	        }
	        
	        for (int i = 0; i < length; i++) {
	            result[i] = leftToI[i] * rightToI[i];
	        }
	        
	        return result;
	    }
}
