package HashMapsLeetCode;

import java.util.*;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		int [] arr2= {1,2,3,4,5,6,6,7,8};
		System.out.println(intersection(arr1, arr2));

	}
	
	public static int intersection(int [] arr, int[] nums) {
		int count=0;
		HashSet<Integer> set=new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
					}
		
		for (int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])) {
				System.out.print(nums[i]+" ");
				count++;
				set.remove(nums[i]);
			}
		}
		System.out.println();
		return count;
	}

}
