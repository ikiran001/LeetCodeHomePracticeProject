package Backtracking;

import java.util.*;

public class Permutation {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		System.out.println(permute(arr));
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>>ans=new ArrayList<>();
		solve(0,nums,ans);
		return ans;
	}

	public static void solve(int ind,int[] nums,List<List<Integer>>ans){
		if(ind==nums.length){
			ArrayList<Integer>arr=new ArrayList<>();
			for(int i=0;i<nums.length;i++){
				arr.add(nums[i]);
			}
			ans.add(arr);
			return;
		}

		for(int i=ind;i<nums.length;i++){
			swap(i,ind,nums);
			solve(ind+1,nums,ans);
			swap(i,ind,nums);//backtrack
		}
	}

	public static void swap(int i,int j,int[]nums){
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}

}


