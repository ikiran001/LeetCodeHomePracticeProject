package ArraysANDStringsss;

import java.util.*;

public class LeetCode1991 {

	public static void main(String[] args) {
		int [] arr= {2,3,-1,8,4};
		System.out.println(findMiddleIndex(arr));

	}

	public static int findMiddleIndex(int[] nums) {
		List<Integer> list=new ArrayList<>();
		for(int i: nums){
			list.add(i);
		}

		for(int i: nums){
			if((i+(i+1)!=(i+2))){
				i+=(i+1);
			}
			else {
				return list.indexOf(i+2);
			}


		}
		return 0;
	}
}
