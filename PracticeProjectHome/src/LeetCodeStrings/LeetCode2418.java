package LeetCodeStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LeetCode2418 {

	public static void main(String[] args) {
		String[] a= {"Mary","John","Emma"};
		int [] heights= {180,165,170};
		System.out.println(Arrays.toString(sortPeople(a, heights)));

	} 
	public static  String[] sortPeople(String[] names, int[] heights) {
		String[] ans=new String[names.length];
		Map<String, Integer> map=new HashMap<>();
		for(int i=0;i<names.length;i++) map.put(names[i], heights[i]);
		System.out.println(map);
		List<Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
		//List<String> list1=new ArrayList<>(map.keySet());
		Collections.sort(list, new Comparator<Entry<String,Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		int  i=names.length-1;
		for(Entry<String, Integer> ch: list) {
			ans[i--]=ch.getKey();
		}
		return ans;




	}

}
