package HashMapsLeetCode;
import  java.util.*;

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		int [] arr2= {1,2,3,4,5,6,7,8};
		System.out.println(union(arr1, arr2));

	}
	public static int union(int[] arr1, int[] arr2) {
		HashSet<Integer> set=new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			set.add(arr2[i]);
		}
		return set.size();

	}

}
