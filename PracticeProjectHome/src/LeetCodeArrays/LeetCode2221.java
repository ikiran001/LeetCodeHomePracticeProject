package LeetCodeArrays;

public class LeetCode2221 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(triangularSum(arr));
	}

	public static int triangularSum(int[] nums) {
		if(nums.length==1) {
			return nums[0];
		}
		int []arr=new int[nums.length-1];
		int j=0;
		for (int i = 0; i < nums.length-1; i++) {
			arr[j]=(nums[i]+nums[i+1])%10;
			j++;
		}
		return triangularSum(arr);
	}
}
