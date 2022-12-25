package LeetCodeArrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode26 {

	public static void main(String[] args) {
	int[] arr= {0,0,1,1,1,2,2,3,3,4};
	System.out.println(removeDuplicates(arr));

	}
	
	  public static int removeDuplicates(int[] nums) {
		  
	        List<Integer> list=new ArrayList<>();
	        for (int i = 0; i < nums.length; i++) {
	        	int count=0;
				for (int j = i; j < nums.length; j++) {
					if(nums[i]==nums[j]) {
						count++;
						if(count>=2) {
							list.add(nums[i]);
							break;
						}
					}
				}
			}
	        int i=0;
	        while (i<nums.length) {
				if(list.contains(nums[i])) {
					i++;
				}
				else {
					list.add(nums[i]);
					i++;
				}
			}
	        return list.size();
	    }

}
