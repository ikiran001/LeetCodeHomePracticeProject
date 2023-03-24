package LeetCodeArrays;

public class LeetCode2293 {

	public static void main(String[] args) {
		int []ar= {1,3,5,2,4,8,2,2};
		System.out.println(minMaxGame(ar));
	}

	public static int minMaxGame(int[] nums) {

		if(nums.length==1){
			return nums[0];
		}
		int n=0;
		int[] arr=new int[nums.length/2];
		for (int i = 0; i < nums.length; i+=4) {

			if(nums[i]<nums[i+1]) {
				arr[n]=nums[i];
				n++;}
				else {arr[n]=nums[i+1];
				n++;}
				int j=i+2;
				if(j<nums.length) {
				if(nums[j]>nums[j+1]) {
					arr[n]=nums[j];
					n++;
				}else {arr[n]=nums[j+1];n++;}
				}
				else {return minMaxGame(arr);}


		}
		return minMaxGame(arr);
	}
}
