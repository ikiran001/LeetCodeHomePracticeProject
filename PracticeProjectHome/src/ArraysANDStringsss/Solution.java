package ArraysANDStringsss;
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		String[] ar= { "abc" , "bac" , "ssd", "dss" , "qwe" , "ewq" , "asdf" , "bca" };
		System.out.println(groupAnagrams(ar));
	}


	public static  List<List<String>> groupAnagrams(String[] strs) {
		Map<String, ArrayList<String>> map=new HashMap<>();
		for(String a:strs) {
			char[] arr=a.toCharArray();
			Arrays.sort(arr);
			String key=new String(arr);
			ArrayList<String> ll=map.getOrDefault(key, new ArrayList<>());
			ll.add(a);
			map.put(key, ll);
		}
		List<List<String>> list= new ArrayList<>();
		for(Map.Entry<String, ArrayList<String>> entry: map.entrySet()) {
			list.add(entry.getValue());
		}
		return list;
	}
}

