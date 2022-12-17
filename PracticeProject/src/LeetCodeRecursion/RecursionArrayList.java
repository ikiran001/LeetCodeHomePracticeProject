package LeetCodeRecursion;

import java.util.ArrayList;

public class RecursionArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		int[] arr= {1,2,3,4,4,5,6,7};
		System.out.println(findIndices2(arr, 4, 0));
	}

	static ArrayList<Integer> findIndices(int [] arr, int target, ArrayList<Integer> list, int index) {

		if(index==arr.length-1) {
			return list;
		}
		if(arr[index]==target) {
			list.add(index);
		}
		return  findIndices(arr, target, list, index+1);
		//return list;
	}

	static ArrayList<Integer> findIndices2(int [] arr, int target, int index) {
		ArrayList<Integer> list=new ArrayList<>();

		if(index==arr.length-1) {
			return list;
		}
		if(arr[index]==target) {
			list.add(index);
		}
		ArrayList<Integer> ans=findIndices2(arr, target, index+1);
		list.addAll(ans);
		return list;
	}



}
