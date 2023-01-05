package LeetCodeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LeetCode274 {

	public static void main(String[] args) {
		int[] arr= {1,2,2,1};
		int [] arr2= {2,2};
		System.out.println(Arrays.toString(intersection(arr, arr2)) );

	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		List<Integer> list=new ArrayList<>();
		
		for (int i = 0; i < nums1.length; i++) {
		
			for (int j = 0; j < nums2.length; j++) {
				if(list.contains(nums1[i])) {break;}
				if(nums1[i]==nums2[j]) {
				
					list.add(nums1[i]);

				}
			}
		}
		int[] arr=new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i]=list.get(i);
		}      
		return arr;
	}

}
