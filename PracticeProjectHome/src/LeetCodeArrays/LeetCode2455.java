package LeetCodeArrays;
//2455. Average Value of Even Numbers That Are Divisible by Three
//https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/
public class LeetCode2455 {

	public static void main(String[] args) {
int[] arr= {1,3,6,10,12,15};
System.out.println(averageValue(arr));

	}
	
	  public static int averageValue(int[] nums) {
		  int ans=0;
		  int count=0;
	        for (int i = 0; i < nums.length; i++) {
				if(nums[i]%3==0  && nums[i]%2==0) {
				ans+=nums[i];
				count++;
				}
			}
	        if(count>0) {
	        	return ans/count;
	        }
	        else {
	        	return 0;
	        }
	    }

}
