package LeetCodeArrays;

import java.util.HashMap;
import java.util.Map;

public class LeetCode137 {

	public static void main(String[] args) {

	}

	public int singleNumber(int[] nums) {
		Map<Integer, Integer> map=new HashMap<>();
		for(int n:nums) {
			map.put(n, map.getOrDefault(n, 0)+1);	
		}
		for(int n:map.keySet()) {
			if(map.get(n)==1) {
				return n;
			}
		}
		return -1;
	}
}
