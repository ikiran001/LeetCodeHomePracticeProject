package LeetCodeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LeetCode2418 {
	public static void main(String[] args) {
		String[] arr= {"Mary","John","Emma","kiran","prakash","jadhav"};
		int[] arr1= {1,2,5,4,3,6};
		System.err.println(Arrays.toString(sortPeople(arr, arr1)));
	}

	@SuppressWarnings("unchecked")
	public static String[] sortPeople(String[] names, int[] heights) {
		String[] ans=new String[names.length];
		Map<String, Integer> map=new HashMap<>();
		for(int i=0;i<names.length;i++) map.put(names[i], heights[i]);
		List<Entry<String , Integer>> list=new ArrayList<>(map.entrySet());
		Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		int  i=names.length-1;
		for(Entry<String, Integer> ch: list) ans[i--]=ch.getKey();
		return ans;
	}
}
