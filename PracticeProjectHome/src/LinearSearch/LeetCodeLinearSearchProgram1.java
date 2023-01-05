package LinearSearch;

public class LeetCodeLinearSearchProgram1 {

	public static void main(String[] args) {
		int[] arr= {1,3,5,6};
		int result=searchNum(arr, 4);
		System.out.println("Index will be  "+result);
	}

	static int searchNum(int[] nums , int target) {
		int max=maxNUmb(nums);
		if(target==0) {
			return -1;
		}
		

		for(int i=0;i<nums.length;i++){
			 
			 
			if(nums[i]==target){
				return i;
			}
			else if(nums.length==i+1 && target>nums[i]){
	            return 1;
	        }
			else if(nums.length==i+1 && target<nums[i]) {
				return 0;
			}
			else if(target>nums[i] && target<nums[i+1] && target<max) {
				return i+1;
			}
			else if(target>max) {
				return nums.length;
			}
			
		}
		return -1;

	}


	static int maxNUmb(int[] nums) {
		int max=nums[0];
		for(int i=0 ; i<nums.length ; i++) {
			
			if(nums[i]>max) {
				max=nums[i];
						
			}
			
		}
		
		return max;

	}
	


	/*
	 * static int additionalnum(int[] nums ,int target) { int max=maxNUmb(nums); for
	 * (int j = 0; j < nums.length; j++) { if(target>nums[j] && target<nums[j+1] &&
	 * target<max) { return j+1; } } return -1;
	 * 
	 * 
	 * 
	 * }
	 */
}
