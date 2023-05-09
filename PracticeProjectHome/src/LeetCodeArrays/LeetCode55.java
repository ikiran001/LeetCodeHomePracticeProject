package LeetCodeArrays;

public class LeetCode55 {

	public static void main(String[] args) {
		int [] arr= {3,2,1,0,4};
		System.out.println(canJump(arr));

	}
	public static boolean canJump(int[] nums) {
		int count=0;
		int target=nums[nums.length-1];
		int i=1;
		while(i<nums.length){
			
			if(nums[nums[i]]==target){
				return true;
			}
			else{i+=nums[i];
			count++;
			if(count>100) {
				return false;
			}}
		}
		return false;    
	}
}
