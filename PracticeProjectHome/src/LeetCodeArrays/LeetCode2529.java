package LeetCodeArrays;

public class LeetCode2529 {

	public static void main(String[] args) {

	}

	public int maximumCount(int[] nums) {
int pos=0;
int neg=0;
for (int i = 0; i < nums.length; i++) {
	if(nums[i]>0) {
		pos++;
	}
	if(nums[i]<0) {
		neg++;
	}
}
return Math.max(pos, neg);
	}
}
