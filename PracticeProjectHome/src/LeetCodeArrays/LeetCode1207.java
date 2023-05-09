package LeetCodeArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode1207 {

	public static void main(String[] args) {
		int[] arr= {1,2,2};
		System.out.println(uniqueOccurrences(arr));

	}


	public static boolean uniqueOccurrences(int[] arr) {

		List<Integer> list=new ArrayList<>();
		Map<Integer,Integer> map=hashmap(arr);
		for(int i:map.keySet()) {
			list.add(map.get(i));
		}
		int[] ans=new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			ans[i]=list.get(i);
		}

		Map<Integer,Integer> map1=hashmap(ans);
		for(int a: map1.keySet()) {
			if(map1.get(a)>1) {
				return false;
			}
		}
		return true;
	}

	public static Map<Integer,Integer> hashmap(int[] arr){
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int a:arr) {
			map.put(a, map.getOrDefault(a, 0)+1);	
		}
		return map;
	}
}
