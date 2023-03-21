package LeetCodeArrays;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class LeetCode1331 {

	public static void main(String[] args) {
		int[] arr= {40,10,20,30};
		System.out.println(Arrays.toString(arrayRankTransform2(arr)));
	}
	
	   public static int[] arrayRankTransform(int[] arr) {
	        int[] A = Arrays.copyOf(arr, arr.length);
	        Arrays.sort(A);
	        HashMap<Integer, Integer> rank = new HashMap<>();
	        for (int x : A)
	          rank.putIfAbsent(x, rank.size() + 1);
	        for (int i = 0; i < arr.length; ++i)
	          A[i] = rank.get(arr[i]);
	        return A;
	    }
	   
	   
	   public static int[] arrayRankTransform2(int[] arr) {
		   int[] A = Arrays.copyOf(arr, arr.length);
	        Arrays.sort(A);
	        HashMap<Integer, Integer> rank = new HashMap<>();
	        for(int x: A) {
	        	if(!rank.containsKey(x)) {
	        		rank.put(x, rank.size()+1);
	        	}
	        	else {}
	        }
	        
	        for (int i = 0; i < A.length; i++) {
				A[i]=rank.get(arr[i]);
			}
	        return A;
	   }
}
