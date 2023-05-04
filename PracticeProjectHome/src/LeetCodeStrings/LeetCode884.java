package LeetCodeStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode884 {

	public static void main(String[] args) {
		String s="this apple is sweet";
		String b="this apple is sour";
		System.out.println(Arrays.toString(uncommonFromSentences(s, b)));
	}


	public static String[] uncommonFromSentences(String s1, String s2) {
		List<String > list=new ArrayList<>();
		String [] a1=s1.split(" ");
		String [] a2=s2.split(" ");
		int len=a1.length+a2.length;
		Map<String, Integer> map=new HashMap<>();
		for(int i=0; i<len; i++) {
			if(i<a1.length)map.put(a1[i], map.getOrDefault(a1[i], 0)+1);
			if(i<a2.length)map.put(a2[i], map.getOrDefault(a2[i], 0)+1);
		}
		for(String s:map.keySet()) if(map.get(s)<2) list.add(s);
		String [] ans=new String[list.size()];
		for(int i=0; i<list.size(); i++) ans[i]=list.get(i);
		return ans;
	}
}
