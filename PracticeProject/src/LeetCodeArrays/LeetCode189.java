package LeetCodeArrays;

public class LeetCode189 {

	public static void main(String[] args) {
	int [] arr= {1,2,3,4,5,6};
	int k=2;
	rotate(arr, k);

	}
	  public static void rotate(int[] nums, int k) {
		   
			k=k%nums.length;
			if(k < 0){ 
				k += nums.length;
			}
			reverseArray(nums, 0, nums.length-1);
			reverseArray(nums, 0, k-1);
			reverseArray(nums, k, nums.length-1);

		}

		public static  void reverseArray(int[] nums, int li , int ri) {
			while(li<ri) {
				int temp=nums[li];
				nums[li]=nums[ri];
				nums[ri]=temp;
				li++;
				ri--;
			}
		}
		}
