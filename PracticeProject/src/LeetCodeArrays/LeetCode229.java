package LeetCodeArrays;
//229
import java.util.ArrayList;
import java.util.List;

public class LeetCode229 {

	public static void main(String[] args) {
		int[] arr= {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2};
		System.out.println(majorityElement(arr));

	}
	public static List<Integer> majorityElement(int[] nums) {
		
		List<Integer> list=new ArrayList<>();
		int n=nums.length;
		for (int i = 0; i < nums.length; i++) {
			int count=0;
			for (int j = 0; j < nums.length; j++) {
				if(list.contains(nums[i])) {break;}
				if(nums[i]==nums[j]) {
					count++;
					if(count>n/3) {
						
						 list.add(nums[i]);
					}
				}
			}
		}
		return list;
	}
}
