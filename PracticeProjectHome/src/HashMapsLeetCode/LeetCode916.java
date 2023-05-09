package HashMapsLeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode916 {

	public static void main(String[] args) {
		String[] arr= {"amazon","apple","facebook","google","leetcode"};
		String [] arr2= {"l","oo"};
		System.out.println(wordSubsets(arr, arr2));
	}

	public static List<String> wordSubsets(String[] words1, String[] words2) {
		List<String> list= new ArrayList<>();
		Map<Character, Integer> map=null;
		Map<String, Integer> map1=new HashMap<>();
		for(String wo:words2)map1.put(wo, map1.getOrDefault(wo, 0)+1);
		for(String word:words1) {
			map=new HashMap<>();
			for(char ch: word.toCharArray()) map.put(ch, map.getOrDefault(ch, 0)+1);
			int c=0;
			for(char ch: word.toCharArray()) {
				if(map1.get(ch+"")!=null && map1.get(ch+"")<=map.get(ch)) {
					c++;
					if(c==words2.length) {
						list.add(word);
					}
				}
			}
		}
		return list;
	}
}
