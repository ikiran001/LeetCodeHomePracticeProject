package LeetCodeArrays;

public class LeetCode2475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int unequalTriplets(int[] nums) {
	int count=0;
		for (int i = 0; i < nums.length; i++) {
		for (int j = 0; j < nums.length; j++) {
			for (int k = 0; k < nums.length; k++) {
				if(nums[i]<nums[j] && nums[j]<nums[k]) {
					count++;
				}
			}
		}
	}
		return count;
	}
}
