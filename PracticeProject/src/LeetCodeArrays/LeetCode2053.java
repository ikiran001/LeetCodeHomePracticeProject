package LeetCodeArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class LeetCode2053 {

	public static void main(String[] args) {
		String[] arr= {"d","b","c","b","c","a"};
		int k=1;
		System.out.println(kthDistinct(arr, k));

	}

	public static String kthDistinct(String[] arr, int k) {	
		List<String> ans=new ArrayList<>();
		HashMap<String, Integer> map=new HashMap<>();
		for(String a: arr) {
			if(map.isEmpty() || !map.containsKey(a)) {
				map.put(a, 1);
			}
			else {
				map.put(a, map.get(a)+1);
			} 
		}
		for(int i=0;i<arr.length;i++)
		{
			if(map.get(arr[i])==1){
				ans.add(arr[i]);
			}

		}
		int d=k-1;
		for(int i=0;i<ans.size();i++)
		{
			if(i==d)
			{
				return ans.get(i);
			}
		}

		return "";


	}
}
