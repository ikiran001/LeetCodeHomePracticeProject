package LeetCodeArrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode390 {

	public static void main(String[] args) {
		int n=9;
		System.out.println(lastRemaining(n));
	}

	public static  int lastRemaining(int n) {
		int[]arr=new int[n]; 
		int j=0;
		for (int i = 1; i <= n; i++) {
			arr[j]=i;
			j++;
		}
		return helper(arr,0);
	}

	public static int helper(int[] arr,int c) {
		int[] arr1 = null;
		if(arr.length==1) {
			return arr[0];
		}
		List<Integer> list=new ArrayList<>();
		if(c%2==0) {
			for (int i = 1; i < arr.length; i+=2) {
				list.add(arr[i]);
			}	
		}
		else {
			for (int i = arr.length-1; i >=0; i-=2) {
				list.add(arr[i]);
			}
			arr1=new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				arr1[i]=list.get(i);
			}
		}
		return helper(arr1,c+1);
	}
}
