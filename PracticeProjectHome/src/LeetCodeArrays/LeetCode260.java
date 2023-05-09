package LeetCodeArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode260 {

	public static void main(String[] args) {
		int[] arr= {1,2,1,3,2,5};
		System.out.println(singleNumber(arr));

	}

	public static String singleNumber(int[] nums) {
		int [] arr=new int[2];
		int i=0;
		Map<Integer, Integer> map=new HashMap<>();


		for(int n: nums) {
			map.put(n, map.getOrDefault(n, 0)+1);
		}

		for(int n : map.keySet()) {
			if(map.get(n)==1) {
				arr[i]=n;
				i++;
			}

		}
		return Arrays.toString(arr);
	}

}
