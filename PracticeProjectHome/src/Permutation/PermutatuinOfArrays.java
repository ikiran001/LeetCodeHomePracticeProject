package Permutation;

import java.util.ArrayList;
import java.util.List;

public class PermutatuinOfArrays {

	public static void main(String[] args) {
		int [] arr= {1,2,3};
		System.out.println(permute(arr));

	}
	public static List<List<Integer>> permute(int[] nums) {
		return		helper(nums, 0);

	}
	public  static List<List<Integer>> helper(int[] nums , int ci) {
		List<List<Integer>> outer=new ArrayList<>();
		List<Integer> inner=new ArrayList<>();
		if(ci==nums.length-1) {
			inner.add(ci);
		//	outer.add(inner);
			return outer;
		}

		for (int i = ci; i < nums.length; i++) {
			swap(nums,ci , i);
			helper(nums, ci+1);
			swap(nums, ci, i);
		}
		outer.add(inner);
		return outer;
	}

	private static void swap(int[] nums, int ci, int i) {
		int temp=nums[ci];
		nums[ci]=nums[i];
		nums[i]=temp;

	}

}
