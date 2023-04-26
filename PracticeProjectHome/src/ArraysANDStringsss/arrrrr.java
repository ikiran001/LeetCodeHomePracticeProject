package ArraysANDStringsss;

import java.util.*;

public class arrrrr {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,76};
		reverseArray(arr);
	} 
	
	public static void reverseArray(int [] arr) {
		List<Integer> list=new LinkedList<>();
		//ads
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list.subList(0, 5));
		int s=0;
		int e=arr.length-1;
		while(s<e) {
			swap(arr, s, e);
			s++;
			e--;
		}
		System.out.println(Arrays.toString(arr));	
	}
	
	public static void swap(int [] arr , int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
